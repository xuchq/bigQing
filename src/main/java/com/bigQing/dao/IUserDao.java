package com.bigQing.dao;

import com.bigQing.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {

    User selectUser(long id);

}