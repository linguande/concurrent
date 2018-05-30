package com.ling.entity;

/**
 * @description: create runnable
 * @author: linguande
 * @create: 2018-05-30 17:34
 **/
public class CreateRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
