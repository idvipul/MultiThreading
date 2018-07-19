package thread.start;

public class Main {
    public static void main(String[] args) {
        A obj = new A();
        obj.start(); // starts the thread by calling run method

        // execute orderly executions - Hi 0.001sec Hello ...
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        B obj1 = new B();
        obj1.start();
    }
}
