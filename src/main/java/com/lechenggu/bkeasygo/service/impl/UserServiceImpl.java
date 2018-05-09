package com.lechenggu.bkeasygo.service.impl;

import com.lechenggu.bkeasygo.dao.IUserDAO;
import com.lechenggu.bkeasygo.model.User;
import com.lechenggu.bkeasygo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDAO iUserDAO;

    public Integer insert(User user) throws Exception {

        return iUserDAO.doCreate(user);
    }

    public Integer upDate(User user) throws Exception {
        return null;
    }

    public Integer reMove(User user) throws Exception {
        return null;
    }

    public List<User> findAll() throws Exception {
        return null;
    }

    public User findById(int id) throws Exception {
        return null;
    }
}
