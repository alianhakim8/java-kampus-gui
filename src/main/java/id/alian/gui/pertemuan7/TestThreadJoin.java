package id.alian.gui.pertemuan7;

public class TestThreadJoin {
    public static void main(String[] args) {
        PrintNameThreadJoin pnt1 = new PrintNameThreadJoin("A");
        PrintNameThreadJoin pnt2 = new PrintNameThreadJoin("B");
        PrintNameThreadJoin pnt3 = new PrintNameThreadJoin("C");
        PrintNameThreadJoin pnt4 = new PrintNameThreadJoin("D");
        System.out.println("Running threads...");
        try {
            pnt1.thread.join();
            pnt2.thread.join();
            pnt3.thread.join();
            pnt4.thread.join();
        } catch (InterruptedException ignored) {
        }
        System.out.println("Threads killed.");
    }
}
