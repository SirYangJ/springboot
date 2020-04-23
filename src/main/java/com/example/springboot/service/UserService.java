package com.example.springboot.service;

import com.example.springboot.pojo.User;

import java.util.List;

/**
 * @Author: yang
 * @Description:
 * @Date: 2020/4/17
 */
public interface UserService {
    /**
     * 插入用户信息
     *
     * @param user
     * @return
     * @throws Exception
     */
    int insertUserInfo(User user) throws Exception;

    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     * @throws Exception
     */
    User queryUserInfoById(Integer id) throws Exception;

    /**
     * 根据name查询用户信息
     *
     * @param user
     * @return
     * @throws Exception
     */
    List<User> getUserByName(User user) throws Exception;
}
