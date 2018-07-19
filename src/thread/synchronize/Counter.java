package thread.synchronize;

public class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}
