package com.flexia.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flexia.SpringBootJpaApplication;
import com.flexia.domain.User;
import com.flexia.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

/**
 * @Author hustffx
 * @Date 2020/6/30 23:00
 */
@SpringBootTest(classes = SpringBootJpaApplication.class)
public class RedisTest {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws JsonProcessingException {
        // 从redis中获得数据，数据的形式json字符串
        String userListJson = redisTemplate.boundValueOps("user.findAll").get();
        // 判断redis中是否存在数据
        if (userListJson==null){
            // 不存在数据，从数据库查询
            List<User> users = userRepository.findAll();
            // 将查询的数据存储到redis缓存中
            // 先将list集合转换为json格式的字符串，使用jackson进行转换
            ObjectMapper objectMapper = new ObjectMapper();
            userListJson = objectMapper.writeValueAsString(users);
            redisTemplate.boundValueOps("user.findAll").set(userListJson);
            System.out.println("====从数据库中获得user的数据====");
        } else {
            System.out.println("====从redis缓存中获得user的数据====");
        }
        // 将数据在控制台打印
        System.out.println(userListJson);
    }
}
