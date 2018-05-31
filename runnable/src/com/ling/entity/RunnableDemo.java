package com.ling.entity;

/**
 * @description: 实现Runnable接口
 * @author: linguande
 * @create: 2018-05-31 15:47
 **/
public class RunnableDemo implements Runnable {

    private String threadName;

    public RunnableDemo() {

    }

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Createing " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread : " + threadName + "," + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
}
