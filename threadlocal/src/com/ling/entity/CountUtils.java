package com.ling.entity;

/**
 * @description:
 * @author: linguande
 * @create: 2018-06-01 16:22
 **/
public class CountUtils {
    public static int count = 0;

    public static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static Integer get() {
        if (threadLocal.get() == null) {
            threadLocal.set(-1);
        }
        return threadLocal.get();
    }

    public static void set() {
        threadLocal.set(count);
    }

    public static void remove() {
        threadLocal.remove();
    }

}
