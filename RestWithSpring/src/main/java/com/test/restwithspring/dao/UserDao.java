package com.test.restwithspring.dao;

import com.test.restwithspring.entity.User;

import java.util.List;

public interface UserDao {

    List<User> listAllUsers();

    User findById(int id);

    int saveUser(User user);

    void updateUser(User user);

    void deleteUserById(int id);

    void deletenAllUsers();

}
