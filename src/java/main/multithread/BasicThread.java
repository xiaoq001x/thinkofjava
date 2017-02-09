package main.multithread;

/**
 * @author 肖强
 * @Time 2017/2/9 10:06
 */
public class BasicThread {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new LiftOff());
            t.start();
        }
        System.out.println("Wating for LiftOff  ");
    }
}
