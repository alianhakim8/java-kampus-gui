package id.alian.gui.pertemuan7;

public class Consumer implements Runnable {
    SharedData sd;

    Consumer(SharedData sd) {
        this.sd = sd;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sd.get();
        }
    }
}
