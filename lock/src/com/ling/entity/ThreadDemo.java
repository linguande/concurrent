package com.ling.entity;

/**
 * @description:
 * @author: linguande
 * @create: 2018-06-07 18:06
 **/
public class ThreadDemo extends Thread {

    private PrintDemo printDemo;

    public ThreadDemo(String name, PrintDemo printDemo) {
        super(name);
        this.printDemo = printDemo;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starts printing a document");
        printDemo.print();
    }
}
