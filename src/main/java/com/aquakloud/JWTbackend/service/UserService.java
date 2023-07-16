package com.aquakloud.JWTbackend.service;

import com.aquakloud.JWTbackend.dao.RoleDao;
import com.aquakloud.JWTbackend.dao.UserDao;
import com.aquakloud.JWTbackend.entity.Role;
import com.aquakloud.JWTbackend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    public User registerNewUser(User user) {
        return userDao.save(user);
    }

    public void initRoleAndUser(){

        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin role");
        roleDao.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("Default role for newly created record");
        roleDao.save(adminRole);

        User adminUser = new User();
        adminUser.setUserFirstName("admin");
        adminUser.setUserLastName("admin");
        adminUser.setUserName("admin123");
        adminUser.setUserPassword("admin@pass");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRoles(adminRoles);
        userDao.save(adminUser);

        User User = new User();
        User.setUserFirstName("raj");
        User.setUserLastName("sharma");
        User.setUserName("raj123");
        User.setUserPassword("raj@pass");
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(userRole);
        User.setRoles(userRoles);
        userDao.save(User);

    }



}
