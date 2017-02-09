package main.multithread;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @author 肖强
 * @Time 2017/2/9 13:13
 */
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<Future<String>>();
        for (int i = 0; i < 10; i++)
            results.add(exec.submit(new TaskWithResult(i)));
        for (Future<String> fs : results) {
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                System.out.println(e);
                return;
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                exec.shutdown();
            }
        }
    }
}
