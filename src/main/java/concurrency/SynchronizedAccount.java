package concurrency;

import static java.lang.Thread.sleep;

public class SynchronizedAccount {
    private long account;
    public synchronized void changeSynch(int val){
        account+=val;
    }

    public void change(int val){
        account+=val;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedAccount sa=new SynchronizedAccount();
        //synchChangeAccount(sa);
        System.out.println(sa.account);
        sa.account=0;
        changeAccountUnsafy(sa);
        System.out.println("unsafe change result:"+sa.account);
    }
    private static void synchChangeAccount(SynchronizedAccount sa) throws InterruptedException {
        new Thread(()->{
            for (int i=0; i< 500; i++){
                sa.changeSynch(1);
            }
        }).start();
        Thread t2=new Thread(()->{
            for (int i=0; i< 500; i++){
                sa.changeSynch(-1);
            }
        });t2.start(); t2.join();
    }

    private static void changeAccountUnsafy(SynchronizedAccount sa) throws InterruptedException {
        Thread t1=new Thread(()->{
            System.out.println("t1 start");
            for (int i=0; i< 500000; i++){
                sa.change(1);
            }
            System.out.println("t1 stop");
        });t1.start();
        Thread t2=new Thread(()->{
            System.out.println("t2 start");
            for (int i=0; i< 500000; i++){
                sa.change(-1);
            }
            System.out.println("t2 stop");
        });t2.start();
        t1.join();t2.join();
    }
}
