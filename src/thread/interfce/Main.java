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

        // with anonymous class
        Thread th3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("Hi from Anonymous Class!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        th3.start();

        // lambada expression -- Java1.8 update
        Thread th4 = new Thread(() -> {
            new Main().show("Hi using Lambada Expression!");
        });
        th4.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() -> new Main().show("Hi again using Lambada Expression!")).start();
    }

    public void show(String str) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(str);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}