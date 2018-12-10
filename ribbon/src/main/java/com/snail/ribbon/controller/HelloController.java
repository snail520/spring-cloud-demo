package com.snail.ribbon.controller;

import com.snail.ribbon.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by gaoxiang on 18/12/10.
 */

@RestController
public class HelloController {

    @Resource
    HelloService helloService;

    @RequestMapping(value = "/hello",method ={ RequestMethod.GET,RequestMethod.POST } )
    public String sayHello(String name){
        return helloService.sayHello() + name;
    }
}
