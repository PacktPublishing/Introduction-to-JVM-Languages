class SleepyClass implements Runnable {
    private int number;
 
    public SleepyClass(int number) { this.number = number; }

    @Override
    public void run() {
        System.out.println("Thread " + number + " started!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + number + " ended!");
    }
}

public class ThreadsDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new SleepyClass(1));
        Thread thread2 = new Thread(new SleepyClass(2));
        thread1.start();
        thread2.start();
    }
}