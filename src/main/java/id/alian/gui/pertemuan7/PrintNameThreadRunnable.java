package id.alian.gui.pertemuan7;

public class PrintNameThreadRunnable implements Runnable {

    Thread thread;

    PrintNameThreadRunnable(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        String name = thread.getName();
        for (int i = 0; i < 100; i++) {
            System.out.print(name);
        }
    }
}
