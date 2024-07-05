// Multi Threading -->

class MyThread1 extends Thread {
    public void run() {
        for(int i = 0; i<=5;i++){
        System.out.println("Thread 1 is running...");
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
         for(int j = 0; j<=5;j++){
            System.out.println("Thread 2 is running...");
            }
    }
}

class MyThread3 extends Thread {
    public void run() {
         for(int k = 0; k<=5;k++){
            System.out.println("Thread 3 is running...");
            }
    }
}

public class TestMultiThreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        t1.start(); // Starting the thread, which calls the run() method
        t2.start();
        t3.start();
    }
}
