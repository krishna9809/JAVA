class SharedResource {
    private int value = 0;
    private boolean available = false;

    public synchronized void produce(int val) {
        while (available) { // Wait if the value is already available
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value = val; // Produce the new value
        available = true;
        System.out.println("Produced: " + value);
        notify(); // Notify a waiting consumer
    }

    public synchronized void consume() {
        while (!available) { // Wait if no value is available
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + value);
        available = false; // Consume the value
        notify(); // Notify a waiting producer
    }
}


public class TestWaitNotify {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                resource.produce(i);
             
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                resource.consume();
              
            }
        });

        producer.start();
        consumer.start();
    }
}
