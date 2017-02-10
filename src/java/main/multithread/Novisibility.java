package main.multithread;

/**
 * @author 肖强
 * @Time 2017/2/10 14:14
 */
public class Novisibility {
    private static volatile boolean ready;
    private static int number;

    private static class RederTread extends Thread {
        public void run() {
            while (!ready) {
                Thread.yield();
                System.out.println("xcxc");
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        new RederTread().start();
        number = 42;
        ready = true;
    }
}
