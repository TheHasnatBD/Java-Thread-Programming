package part_one.chapter_2.ex_02;

import java.util.concurrent.TimeUnit;

/**
 *  Part - 1
 *  Chapter - 2
 *  Page 30-32
 */

public class ExtendedThreadDemo {
    public static void main(String[] args) {

        ExtendedThread extendedThread = new ExtendedThread();
        extendedThread.setName("My Thread");
        extendedThread.start();

        for (int i = 0; i < 5; i++){
            System.out.println("[" + i + "] Inside " + Thread.currentThread().getName());

            sleepOneSecond();
        }
    }

    private static void sleepOneSecond() {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
