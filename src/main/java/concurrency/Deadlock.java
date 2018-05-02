package concurrency;

import static java.lang.Thread.sleep;

public class Deadlock {
    public static void simpleDeadlockWithString(){
        String str1="";
        String str2="";
            new Thread(()->{
                synchronized(str2){
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                synchronized ((str1)){
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        synchronized(str1){
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized ((str2)){
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
}
