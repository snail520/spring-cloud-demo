package com.snail.ribbon.service;

import org.springframework.stereotype.Service;

/**
 * Created by gaoxiang on 18/12/10.
 */

@Service
public class HelloService {
    public String sayHello(){
        return "hello world";
    }
}
