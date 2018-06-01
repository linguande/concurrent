package com.ling;

import com.ling.entity.ThreadDemo;

/**
 * @description: join
 * @author: linguande
 * @create: 2018-06-01 14:45
 **/
public class TestThread {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo("thread-1");
        threadDemo.start();
        try {
            threadDemo.join();//join方法进行同步，先执行完thread-1线程，再执行main主线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Count End!");
    }
}
