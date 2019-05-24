package com.wewe;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Author: wewe
 * Date:  19-2-10 下午11:39
 * Description:
 * Refer To:
 */
public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        context.start();
        System.in.read();
    }
}
