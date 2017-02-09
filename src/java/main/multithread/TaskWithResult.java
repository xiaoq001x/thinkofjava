package main.multithread;

import java.util.concurrent.Callable;

/**
 * @author 肖强
 * @Time 2017/2/9 13:11
 */
public class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }


    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public String call() throws Exception {
        return "result of " + id;
    }

}
