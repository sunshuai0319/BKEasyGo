package com.lechenggu.bkeasygo.service.impl;

import com.lechenggu.bkeasygo.dao.IManagerDAO;
import com.lechenggu.bkeasygo.service.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements IManagerService {

    @Autowired
    private IManagerDAO iManagerDAO;

    public int login(String managerName, String managerPass) {

        return iManagerDAO.loginByManager(managerName, managerPass);
    }
}
