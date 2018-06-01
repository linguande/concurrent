package com.ling.entity;

/**
 * @description: join
 * @author: linguande
 * @create: 2018-06-01 14:46
 **/
public class ThreadDemo extends Thread {
    private String threadName;

    public ThreadDemo() {

    }

    public ThreadDemo(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Count --- " + i);
        }
        System.out.println("Thread Name " + threadName + " exiting.");
    }
}
