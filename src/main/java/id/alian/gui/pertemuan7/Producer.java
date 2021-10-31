package id.alian.gui.pertemuan7;

public class Producer implements Runnable {

    SharedData sd;

    Producer(SharedData sd) {
        this.sd = sd;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sd.set((int) (Math.random() * 100));
        }
    }
}
