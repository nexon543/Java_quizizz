package jmm;

import static java.lang.Thread.sleep;

public class OutOfMemoryError {

    private final static int bigNumber = 10000000;

    public static void withThreads() {
        int i = 0;
        while (i < bigNumber) {
            new Thread(() -> {
                try {
                    sleep(bigNumber);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    public static void withMassive() {
        int i = 0;
        while (i < bigNumber) {
            byte[][] b = new byte[bigNumber][];
            b[i] = new byte[bigNumber];
        }
    }

    public static void main(String[] args) {
        //withThreads();
        withMassive();
    }
}
