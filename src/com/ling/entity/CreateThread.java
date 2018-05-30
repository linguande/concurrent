package com.ling.entity;

import com.ling.common.AddUtils;

/**
 * @description: createthread
 * @author: linguande
 * @create: 2018-05-30 17:33
 **/
public class CreateThread extends Thread {
    @Override
    public void run(){
        AddUtils.getResult();
        System.out.println("thread");
    }
}
