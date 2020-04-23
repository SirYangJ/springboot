package com.example.springboot.service.impl;

import com.example.springboot.dao.UserMapper;
import com.example.springboot.pojo.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: yang
 * @Description:
 * @Date: 2020/4/17
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insertUserInfo(User user) throws Exception {
        return userMapper.insert(user);
    }

    @Override
    public User queryUserInfoById(Integer id) throws Exception {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> getUserByName(User user) throws Exception {
        return userMapper.getUserByName(user);
    }
}
