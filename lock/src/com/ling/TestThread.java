package com.ling;

import com.ling.entity.PrintDemo;
import com.ling.entity.ThreadDemo;

/**
 * @description: lock
 * @author: linguande
 * @create: 2018-06-07 18:00
 **/
public class TestThread {

    public static void main(String[] args) {
        PrintDemo printDemo = new PrintDemo();

        ThreadDemo t1 = new ThreadDemo("Thread - 1 ", printDemo);
        ThreadDemo t2 = new ThreadDemo("Thread - 2 ", printDemo);
        ThreadDemo t3 = new ThreadDemo("Thread - 3 ", printDemo);
        ThreadDemo t4 = new ThreadDemo("Thread - 4 ", printDemo);
        ThreadDemo t5 = new ThreadDemo("Thread - 5 ", printDemo);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
