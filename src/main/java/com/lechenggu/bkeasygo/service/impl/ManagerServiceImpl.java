package com.lechenggu.bkeasygo.service.impl;

import com.lechenggu.bkeasygo.dao.IManagerDAO;
import com.lechenggu.bkeasygo.exception.AppException;
import com.lechenggu.bkeasygo.model.Manager;
import com.lechenggu.bkeasygo.service.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements IManagerService {

    @Autowired
    private IManagerDAO iManagerDAO;

    public Manager login(String managerName, String managerPass)throws AppException{

        Manager manager = iManagerDAO.loginByManager(managerName, managerPass);

        if (manager.getManagerName() == null || manager.getManagerName() == "") {
            throw new AppException("登录失败",1000);
        }

        return manager;

    }
}
