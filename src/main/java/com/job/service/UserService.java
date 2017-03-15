package com.job.service;

import com.job.bean.User;
import com.job.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright with Patsnap company.
 * Author: Tory
 * Date: 3/15/17
 * Time: 4:51 PM
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void saveUser(User user){
        userDao.save(user);
    }
}
