package com.ling;

import com.ling.entity.Answer;
import com.ling.entity.Chat;
import com.ling.entity.Question;

/**
 * @description: 线程间通讯
 * @author: linguande
 * @create: 2018-05-31 17:40
 **/
public class TestThread {
    public static void main(String[] args) {
        Chat chat = new Chat();
        new Question(chat);
        new Answer(chat);
    }
}
