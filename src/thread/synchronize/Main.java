package thread.synchronize;

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.increment();

        System.out.println(c.count);
    }
}
