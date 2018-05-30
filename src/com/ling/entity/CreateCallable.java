package com.ling.entity;

import java.util.concurrent.Callable;

/**
 * @description: callable
 * @author: linguande
 * @create: 2018-05-30 17:39
 **/
public class CreateCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "callable";
    }
}
