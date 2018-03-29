package part_one.chapter_1;

public class MainThreadExample {

    public static void main(String[] args) {

        Thread current_thread = Thread.currentThread();

        System.out.println("Current Thread Name: "+ current_thread.getName());
    }
}
