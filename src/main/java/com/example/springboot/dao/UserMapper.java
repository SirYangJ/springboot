package com.example.springboot.dao;

import com.example.springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: yang
 * @Description:
 * @Date: 2020/4/17
 */
@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {

    List<User> getUserByName(User user);
}
