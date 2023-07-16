package com.aquakloud.JWTbackend.service;

import com.aquakloud.JWTbackend.dao.RoleDao;
import com.aquakloud.JWTbackend.dao.UserDao;
import com.aquakloud.JWTbackend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    public User registerNewUser(User user) {
        return userDao.save(user);

    }
}
