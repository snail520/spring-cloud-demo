package com.snail.authservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by gaoxiang on 18/12/27.
 */

@RestController
public class UserController {

    @GetMapping(value = "/current")
    public Principal getUser(Principal principal){
        return principal;
    }
}
