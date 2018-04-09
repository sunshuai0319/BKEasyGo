package com.lechenggu.bkeasygo.service;


import com.lechenggu.bkeasygo.exception.AppException;
import com.lechenggu.bkeasygo.model.Manager;

public interface IManagerService {

    /**
     * 管理员登录
     *
     * @param managerName 用户输入的用户名
     * @param managerPass 密码
     * @return 返回数据库查询结果
     */
    Manager login(String managerName, String managerPass) throws AppException;
}
