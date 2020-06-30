package com.flexia.mapper;

import com.flexia.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author hustffx
 * @Date 2020/6/30 21:36
 */
@Mapper
public interface UserMapper {
    /**
     * 查询用户列表
     *
     * @return
     */
    @Select("select * from user")
    List<User> queryUserList();
}
