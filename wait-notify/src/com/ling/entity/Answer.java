package com.ling.entity;

import com.sun.org.apache.xpath.internal.operations.And;

/**
 * @description:
 * @author: linguande
 * @create: 2018-05-31 17:52
 **/
public class Answer implements Runnable {

    private Chat chat;

    private String[] strings = {"Hi", "I am good, what about you?", "Great!"};

    public Answer() {

    }

    public Answer(Chat chat) {
        this.chat = chat;
        new Thread(this, "Answer").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < strings.length; i++) {
            chat.Answer(strings[i]);
        }
    }
}
