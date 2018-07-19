package thread.synchronize;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        });

        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        });

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println(c.count);
    }
}
