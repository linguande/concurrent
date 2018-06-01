package com.ling.entity;

/**
 * @description:
 * @author: linguande
 * @create: 2018-06-01 14:21
 **/
public class PrintDemo {
    public void printCount() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Counter --- " + i);
            }
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
    }
}
