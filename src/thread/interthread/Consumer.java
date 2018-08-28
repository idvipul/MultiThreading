package thread.interthread;

public class Consumer implements Runnable{
    A a;

    // constructor
    public Consumer(A a) {
        this.a = a;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    public void run() {
        while(true) {
            a.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
