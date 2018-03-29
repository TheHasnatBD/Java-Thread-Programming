package part_one.chapter_2.ex_02;

import java.util.concurrent.TimeUnit;

public class ExtendedThread extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 5; i++){

            System.out.println("[" + i + "] Inside "+ Thread.currentThread().getName());

            sleepOneSecond();
        }
    }

    private static void sleepOneSecond() {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1)); // 100 Mill sec
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
