package com.lechenggu.bkeasygo.dao;

import com.lechenggu.bkeasygo.model.Manager;
import com.lechenggu.bkeasygo.model.User;

import java.util.List;

public interface IUserDAO {

    /**
     * 用户新增
     *
     * @param user  用户对象 数据补齐后
     * @return 成功返回1   否则返回0
     */
    Integer doCreate(User user);

    /**
     * 用户删除
     *
     * @param user 用户对象
     * @return 成功返回1   否则返回0
     */
    Integer doRemove(User user);

    /**
     * 用户修改
     *
     * @param user 用户对象
     * @return 成功返回1   否则返回0
     */
    Integer doUpdate(User user);

    /**
     * 查询全部
     *
     * @return 用户对象list集合
     */
    List<User> findAll();

    /**
     * 根据id查询
     *
     * @return 用户对象
     */
    User findById(int id);


}
