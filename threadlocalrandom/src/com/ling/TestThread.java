package com.ling;

import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @description: 线程随机数
 * @author: linguande
 * @create: 2018-06-05 17:21
 **/
public class TestThread {
    public static void main(final String[] arguments) {
        System.out.println("Random Integer: " + new Random().nextInt());
        System.out.println("Seeded Random Integer: " + new Random(15).nextInt());
        System.out.println("Thread Local Random Integer: " + ThreadLocalRandom.current().nextInt());
        final ThreadLocalRandom random = ThreadLocalRandom.current();
        //random.setSeed(15);  //exception will come as seeding is not allowed in ThreadLocalRandom.
        System.out.println("Seeded Thread Local Random Integer: " + random.nextInt());
    }
}
