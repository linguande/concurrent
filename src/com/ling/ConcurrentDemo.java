package com.ling;

import com.ling.entity.CreateCallable;
import com.ling.entity.CreateRunnable;
import com.ling.entity.CreateThread;

import java.util.concurrent.*;

/**
 * @description: concurrent demo
 * @author: linguande
 * @create: 2018-05-30 17:18
 **/
public class ConcurrentDemo {
    public static void main(String[] args) {
        //继承Thread
        CreateThread createThread = new CreateThread();
        createThread.setName("thread");
        createThread.start();

        //实现runnable接口
        Thread thread = new Thread(new CreateRunnable());
        thread.setName("runnable");
        thread.start();

        //实现callable接口
        //借助FutureTask执行
        Callable<String> callable = new CreateCallable();
        FutureTask<String> futureTask = new FutureTask<>(callable);
        new Thread(futureTask).start();
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        //借助线程池执行
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> future = executorService.submit(new CreateCallable());
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
