package lesson13_multithreading;

public class MyRunnable implements Runnable {
    private int count = 0;
    private String name;
    public MyRunnable() { }
    
    public MyRunnable(String name)
    {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            count++;
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
            System.out.println(this.name + " - " + count);
        }
    }
}
