package com.flexia.repository;

import com.flexia.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author hustffx
 * @Date 2020/6/30 22:38
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    @Override
    List<User> findAll();
}
