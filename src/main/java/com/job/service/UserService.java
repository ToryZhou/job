package com.job.service;

import com.job.bean.User;
import com.job.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public void getUserList(){
        List<User> userList = new ArrayList<>();
        Iterable<User> all = userDao.findAll();

//        while (all.iterator().hasNext()){
//            userList.add(all.iterator().next());
//        }
        System.out.println(userList.size());
    }
}
