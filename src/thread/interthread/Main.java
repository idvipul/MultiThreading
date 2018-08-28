package thread.interthread;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        new Producer(a); // anonymous object
        new Consumer(a);
    }
}
