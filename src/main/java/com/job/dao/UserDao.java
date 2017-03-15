package com.job.dao;

import com.job.bean.User;

import org.springframework.data.repository.CrudRepository;

/**
 * Copyright with Patsnap company.
 * Author: Tory
 * Date: 3/15/17
 * Time: 4:49 PM
 */
public interface UserDao  extends CrudRepository<User, Long> {
}
