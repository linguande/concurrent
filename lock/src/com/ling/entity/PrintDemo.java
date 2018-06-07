package com.ling.entity;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: lock的使用
 * @author: linguande
 * @create: 2018-06-07 18:00
 **/
public class PrintDemo {
    private final Lock lock = new ReentrantLock();

    public void print() {
        lock.lock();
        try {
            Long duration = (long) (Math.random() * 10000);
            System.out.println(Thread.currentThread().getName()
                    + " Time Taken " + (duration / 1000) + " seconds.");
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + " printed the document successfully.");
            lock.unlock();
        }
    }
}
