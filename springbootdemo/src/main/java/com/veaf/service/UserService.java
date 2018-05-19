package com.veaf.service;

import com.veaf.dao.UserDao;
import com.veaf.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User findUserByName(String name){
        User user = null;
        try{
            user = userDao.findByUserName(name);
        }catch (Exception e){}
        return user;
    }
}
