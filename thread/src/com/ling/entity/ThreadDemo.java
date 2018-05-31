package com.ling.entity;

/**
 * @description: 继承thread
 * @author: linguande
 * @create: 2018-05-31 16:23
 **/
public class ThreadDemo extends Thread {

    private String threadName;

    public ThreadDemo() {

    }

    public ThreadDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Createing " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        for (int i = 4; i > 0; i--) {
            System.out.println("Thread : " + threadName + "," + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println("Thread " + threadName + "interrupted.");
            }
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
}
