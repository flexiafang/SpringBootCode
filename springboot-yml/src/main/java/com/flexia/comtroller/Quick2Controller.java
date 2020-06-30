package com.flexia.comtroller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hustffx
 * @Date 2020/6/30 20:45
 */
@RestController
@ConfigurationProperties(prefix = "person")
public class Quick2Controller {

    private String name;
    private Integer age;

    @RequestMapping("quick2")
    public String quick() {
        return "name: " + name  +", age: "+ age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
