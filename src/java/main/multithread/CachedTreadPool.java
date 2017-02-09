package main.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 肖强
 * @Time 2017/2/9 10:49
 */
public class CachedTreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++)
            exec.execute(new LiftOff());
        exec.shutdown();
    }
}
