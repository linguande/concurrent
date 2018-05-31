package com.ling;

import com.ling.entity.ThreadDemo;

/**
 * @description: 继承thread创建线程
 * @author: linguande
 * @create: 2018-05-31 16:20
 **/
public class TestThread {
    public static void main(String[] args) {
        ThreadDemo threadDemo1 = new ThreadDemo("Thread-1");
        threadDemo1.start();

        ThreadDemo threadDemo2 = new ThreadDemo("Thread-2");
        threadDemo2.start();
    }
}
