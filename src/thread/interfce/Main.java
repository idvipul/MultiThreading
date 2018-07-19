package thread.interfce;

public class Main {
    public static void main(String[] args) {

        Runnable obj = new C(); // create object of interface
        Runnable obj1 = new D();

        Thread th = new Thread(obj); // create object of thread and pass the runnable object
        Thread th1 = new Thread(obj1);

        th1.start(); // starts the thread by calling run method

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        th.start();
    }

}
