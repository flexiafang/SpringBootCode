package com.flexia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hustffx
 * @Date 2020/6/29 18:45
 */
@RestController
public class QuickStartController {

    @GetMapping("quick")
    public String test() {
        return "hello springboot quick start";
    }
}
