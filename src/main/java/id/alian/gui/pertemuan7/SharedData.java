package id.alian.gui.pertemuan7;

public class SharedData {
    int data;
    boolean valueSet = false;

    synchronized void set(int value) {
        if (valueSet) {
            try {
                wait();
            } catch (InterruptedException ignored) {

            }
        }
        System.out.println("Generate " + value);
        data = value;
        valueSet = true;
        notify();
    }

    synchronized int get() {
        if (!valueSet) {
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        }
        System.out.println("Get " + data);
        valueSet = false;
        notify();
        return data;
    }
}
