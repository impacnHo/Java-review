package thread.implementation;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 与Runnable相比，Callable有返回值，返回值通过FutureTask封装
 * */
public class ByCallable implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        return 123;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ByCallable callable = new ByCallable();
        FutureTask<Integer> ft = new FutureTask<Integer>(callable);
        Thread thread = new Thread(ft);
        thread.start();
        System.out.println(ft.get());
    }
}
