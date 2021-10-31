package id.alian.gui.pertemuan7;

public class TestProducerConsumer {
    public static void main(String[] args) {
        SharedData sd = new SharedData();
        new Producer(sd);
        new Consumer(sd);
    }
}
