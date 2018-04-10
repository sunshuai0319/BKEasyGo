package com.lechenggu.bkeasygo.dao;

import com.lechenggu.bkeasygo.model.Manager;

import java.util.List;

public interface IUserDAO {

    /**
     * 用户新增
     *
     * @param manager 用户对象 数据补齐后
     * @return 成功返回1   否则返回0
     */
    Integer doCreate(Manager manager);

    /**
     * 用户删除
     *
     * @param manager 用户对象
     * @return 成功返回1   否则返回0
     */
    Integer doRemove(Manager manager);

    /**
     * 用户修改
     *
     * @param manager 用户对象
     * @return 成功返回1   否则返回0
     */
    Integer doUpdate(Manager manager);

    /**
     * 查询全部
     *
     * @return 用户对象list集合
     */
    List<Manager> findAll();

    /**
     * 根据id查询
     *
     * @return 用户对象
     */
    Manager findById();


}
