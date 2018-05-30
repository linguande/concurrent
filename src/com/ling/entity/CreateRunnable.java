package com.ling.entity;

import com.ling.common.AddUtils;

/**
 * @description: create runnable
 * @author: linguande
 * @create: 2018-05-30 17:34
 **/
public class CreateRunnable implements Runnable {
    @Override
    public void run() {
        AddUtils.getResult();
        System.out.println("runnable");
    }
}
