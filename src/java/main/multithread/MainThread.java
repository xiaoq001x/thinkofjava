package main.multithread;

/**
 * @author 肖强
 * @Time 2017/2/8 15:03
 */
public class MainThread {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            LiftOff launch = new LiftOff();
            launch.run();
        }
        System.out.println("watting for LiftOff ");
    }
}
