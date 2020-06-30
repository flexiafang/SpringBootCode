package com.flexia.test;

import com.flexia.SpringBootJpaApplication;
import com.flexia.domain.User;
import com.flexia.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author hustffx
 * @Date 2020/6/30 22:42
 */
@SpringBootTest(classes = SpringBootJpaApplication.class)
public class JpaTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() {
        List<User> users = userRepository.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
