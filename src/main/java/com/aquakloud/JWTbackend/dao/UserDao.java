package com.aquakloud.JWTbackend.dao;

import com.aquakloud.JWTbackend.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
