package com.ling;

import com.ling.entity.RunnableDemo;

/**
 * @description: 通过实现runnable接口创建线程
 * @author: linguande
 * @create: 2018-05-31 15:46
 **/
public class TestThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableDemo("Thread-1"));
        thread1.start();

        Thread thread2 = new Thread(new RunnableDemo("Thread-2"));
        thread2.start();
    }
}
