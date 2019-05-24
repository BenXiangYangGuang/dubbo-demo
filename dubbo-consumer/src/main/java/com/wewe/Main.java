package com.wewe;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Author: wewe
 * Date:  19-2-11 上午12:15
 * Description:
 * Refer To:
 */
public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        GreetingService greetingService = (GreetingService) context.getBean("greetingService");
        String greetMessage = greetingService.hello("Eric");
        System.out.println("Consumer ==> " + greetMessage);
        context.destroy();
    }
}
