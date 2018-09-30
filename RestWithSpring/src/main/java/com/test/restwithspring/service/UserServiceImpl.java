package com.test.restwithspring.service;

import com.test.restwithspring.dao.UserDao;
import com.test.restwithspring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<User> findAllUsers() {
        return userDao.listAllUsers();
    }

    @Override
    public User findById(int id) {
        return userDao.findById(id);
    }

    @Override
    @Transactional
    public int saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteUserById(int id) {
        userDao.deleteUserById(id);
    }

    @Override
    @Transactional
    public void deleteAllUsers() {
        userDao.deleteAllUsers();
    }
}
