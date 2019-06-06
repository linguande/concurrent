package com.ling.entity;

/**
 * @description:
 * @author: linguande
 * @create: 2018-06-01 15:48
 **/
public class ThreadDemo extends Thread {

    private String threadName;

    public ThreadDemo() {

    }

    public ThreadDemo(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        int count = ++CountUtils.count;
        System.out.println(threadName + " count : " + count);

        //初始值
        System.out.println(threadName + " threadLocal init get : " + CountUtils.get());

        //给threadLocal赋值
        CountUtils.set();
        System.out.println(threadName + " threadLocal after set : " + CountUtils.get());

        //清除threadLocal值
        CountUtils.remove();
        System.out.println(threadName + " threadLocal after remove : " + CountUtils.get());

        //重新赋值，测试下一线程能否拿到threadLocal的值
        CountUtils.set();
    }
}
