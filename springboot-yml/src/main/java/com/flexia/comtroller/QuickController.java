package com.flexia.comtroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hustffx
 * @Date 2020/6/30 20:45
 */
@RestController
public class QuickController {

    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private Integer age;

    @RequestMapping("quick")
    public String quick() {
        return "name: " + name  +", age: "+ age;
    }
}
