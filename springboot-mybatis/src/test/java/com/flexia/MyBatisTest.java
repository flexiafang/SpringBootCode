package com.flexia;

import com.flexia.domain.User;
import com.flexia.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @Author hustffx
 * @Date 2020/6/30 22:16
 */
@SpringBootTest(classes = {SpringBootMybatisApplication.class})
public class MyBatisTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        for (User user : userMapper.queryUserList()) {
            System.out.println(user);
        }
    }
}
