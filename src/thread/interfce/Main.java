package thread.interfce;

public class Main {
    public static void main(String[] args) {

        Runnable obj = new C(); // create object of interface
        Runnable obj1 = new D();

        Thread th = new Thread(obj); // create object of thread and pass the runnable object of class C
        Thread th1 = new Thread(obj1);

        th1.start(); // starts the thread by calling run method

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        th.start();

        // with inner class
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("Hi from Inner Class!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread th2 = new Thread(r); // pass runnable object of inner class
        th2.start();

    }
}
