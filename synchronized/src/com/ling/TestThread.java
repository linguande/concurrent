package com.ling;

import com.ling.entity.PrintDemo;
import com.ling.entity.ThreadDemo;

/**
 * @description: 线程同步
 * @author: linguande
 * @create: 2018-06-01 14:20
 **/
public class TestThread {

    public static void main(String[] args) {
        PrintDemo printDemo = new PrintDemo();

        ThreadDemo threadDemo1 = new ThreadDemo("Thread-1",printDemo);
        ThreadDemo threadDemo2 = new ThreadDemo("Thread-2",printDemo);

        threadDemo1.start();
        threadDemo2.start();
    }
}
