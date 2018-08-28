package thread.interthread;

public class A {
    int num;
    boolean valueSet = false;

    public synchronized void put(int num) {
        while(valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Put : " + num);
        this.num = num;
        valueSet = true;
        notify();
    }

    public synchronized void get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Get : " + num);
        valueSet = false;
        notify();
    }
}
