package com.ling.entity;

/**
 * @description:
 * @author: linguande
 * @create: 2018-05-31 17:48
 **/
public class Question implements Runnable {

    private Chat chat;

    String[] strings = {"Hi", "How are you?", "I am also doing fine!"};

    public Question() {

    }

    public Question(Chat chat) {
        this.chat = chat;
        new Thread(this, "Question").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < strings.length; i++) {
            chat.Question(strings[i]);
        }
    }
}
