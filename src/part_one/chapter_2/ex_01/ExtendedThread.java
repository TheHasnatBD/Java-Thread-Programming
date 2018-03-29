package part_one.chapter_2.ex_01;

public class ExtendedThread extends Thread {

    @Override
    public void run() {

        String currentThreadName = Thread.currentThread().getName();

        System.out.println("Thread Name: "+ currentThreadName);
    }
}
