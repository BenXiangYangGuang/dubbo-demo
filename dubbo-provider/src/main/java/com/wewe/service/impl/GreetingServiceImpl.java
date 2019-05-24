package com.wewe.service.impl;


import com.wewe.GreetingService;

/**
 * Author: wewe
 * Date:  19-2-10 下午4:51
 * Description:
 * Refer To:
 */
public class GreetingServiceImpl implements GreetingService {

    public String hello(String name) {
        return "Hello " + name;
    }
}
