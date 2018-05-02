package concurrency;

public class Synchronized {

    private String name;
    int iterations = 150;

    public Synchronized(String name) {
        this.name = name;
    }

    public synchronized void foo1(String flag) {
        int count = 0;
        while (count++ < iterations) {
            System.out.println(name + "; Func foo1; " + flag);
        }
    }

    public synchronized void foo2(String flag) {
        int count = 0;
        while (count++ < iterations) {
            System.out.println(name + "; Func foo2; " + flag);
        }
    }

    public void foo3(String flag) {
        synchronized (this) {
            int count = 0;
            while (count++ < iterations) {
                System.out.println(name + "; Func foo3; " + flag);
            }
        }

    }

    public void foo4(String flag) {
        synchronized (name) {
            int count = 0;
            while (count++ < iterations) {
                System.out.println(name + "; Func foo4; " + flag);
            }
        }

    }

    public static void main(String[] args) {
        final Synchronized synchronizedObj = new Synchronized("synch1");
        final Thread thread1 = new Thread() {
            public Synchronized synch = synchronizedObj;

            @Override
            public void run() {
                synch.foo1("thread1");
            }
        };
        Thread thread2 = new Thread() {
            public Synchronized synch = synchronizedObj;

            @Override
            public void run() {
                synch.foo2("thread2");
            }
        };
        Thread thread3 = new Thread() {
            public Synchronized synch = synchronizedObj;

            @Override
            public void run() {

                synch.foo3("thread3");
            }
        };
        Thread thread4 = new Thread() {
            public Synchronized synch = synchronizedObj;

            @Override
            public void run() {

                synch.foo4("thread4");
            }

        };
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
