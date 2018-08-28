package thread.interthread;

public class Producer implements Runnable {

    A a;

    // constructor
    public Producer(A a) {
        this.a = a;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    public void run() {
        int i = 0;

        while(true) {
            a.put(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
