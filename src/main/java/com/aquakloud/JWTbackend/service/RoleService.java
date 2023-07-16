package com.aquakloud.JWTbackend.service;

import com.aquakloud.JWTbackend.dao.RoleDao;
import com.aquakloud.JWTbackend.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {


    @Autowired
    private RoleDao roleDao;
    public Role createNewRole(Role role) {
        return roleDao.save(role);

    }

}
