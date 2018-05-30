package com.ling.entity;

/**
 * @description: createthread
 * @author: linguande
 * @create: 2018-05-30 17:33
 **/
public class CreateThread extends Thread {
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
