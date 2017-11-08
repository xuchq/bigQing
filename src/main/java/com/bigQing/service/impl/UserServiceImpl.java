package com.bigQing.service.impl;

import com.bigQing.dao.IUserDao;
import com.bigQing.model.User;
import com.bigQing.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}