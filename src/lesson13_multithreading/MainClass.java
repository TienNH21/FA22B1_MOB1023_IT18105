package lesson13_multithreading;

public class MainClass {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable("Thread 1");
        MyRunnable r2 = new MyRunnable("Thread 2");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        
        t1.start();
        t2.start();
    }
}
