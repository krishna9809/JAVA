class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class TestRunnable {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.start(); // Starting the thread, which calls the run() method
    }
}
