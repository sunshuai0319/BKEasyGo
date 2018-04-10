package com.lechenggu.bkeasygo.service.impl;

import com.lechenggu.bkeasygo.dao.IManagerDAO;
import com.lechenggu.bkeasygo.model.Manager;
import com.lechenggu.bkeasygo.service.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements IManagerService {

    @Autowired
    private IManagerDAO iManagerDAO;

    /**
     * 管理员登录
     *
     * @param managerName 用户输入的用户名
     * @param managerPass 密码
     * @throws Exception
     * @return返回管理员对象
     */
    public Manager login(String managerName, String managerPass) throws Exception {
//        调用DAO
        Manager manager = iManagerDAO.loginByManager(managerName, managerPass);

        if (manager.getManagerName() == null || manager.getManagerName() == "") {
//            登录失败触发异常
            throw new Exception();
        }
//          登录成功返回管理员对象
        return manager;

    }
}
