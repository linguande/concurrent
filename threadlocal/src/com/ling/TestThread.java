package com.ling;

import com.ling.entity.ThreadDemo;

/**
 * @description: 线程副本变量
 * @author: linguande
 * @create: 2018-06-01 15:27
 **/
public class TestThread {
    public static void main(String[] args) {
        ThreadDemo threadDemo1 = new ThreadDemo("thread-1");
        ThreadDemo threadDemo2 = new ThreadDemo("thread-2");
        ThreadDemo threadDemo3 = new ThreadDemo("thread-3");

        try {
            threadDemo1.start();

            threadDemo1.join();

            threadDemo2.start();

            threadDemo2.join();

            threadDemo3.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
