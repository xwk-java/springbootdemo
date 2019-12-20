package com.xwk.demo.service.impl;

import com.xwk.demo.dao.UserDao;
import com.xwk.demo.pojo.User;
import com.xwk.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.getAll();
    }

    @Override
    public void createUser(User user) {
        userDao.save(user);
    }

    @Override
    public User getUser(Integer id) {
        return userDao.findOne(id);
    }

    @Override
    public void updateUser(Integer id, User user) {
        user.setId(id);
        userDao.update(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userDao.delete(id);
    }
}
