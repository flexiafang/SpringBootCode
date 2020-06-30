package com.flexia.controller;

import com.flexia.domain.User;
import com.flexia.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author hustffx
 * @Date 2020/6/30 21:44
 */
@Controller
public class MyBatisController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("queryUser")
    @ResponseBody
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }
}
