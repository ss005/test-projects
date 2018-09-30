package com.test.restwithspring.service;

import com.test.restwithspring.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();

    User findById(int id);

    int saveUser(User user);

    void updateUser(User user);

    void deleteUserById(int id);

    void deleteAllUsers();

}
