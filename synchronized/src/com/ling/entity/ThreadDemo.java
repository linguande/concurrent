package com.ling.entity;

/**
 * @description: 同步锁
 * @author: linguande
 * @create: 2018-06-01 14:29
 **/
public class ThreadDemo extends Thread {
    private String threadName;

    private PrintDemo printDemo;

    public ThreadDemo() {

    }

    public ThreadDemo(String threadName, PrintDemo printDemo) {
        this.threadName = threadName;
        this.printDemo = printDemo;
    }

    public void run() {
        synchronized (printDemo) {
            printDemo.printCount();
            System.out.println("Thread " + threadName + " exiting.");
        }
    }
}
