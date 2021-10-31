package id.alian.gui.pertemuan7;

public class PrintNameThreadJoin implements Runnable {
    Thread thread;

    PrintNameThreadJoin(String name) {
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
