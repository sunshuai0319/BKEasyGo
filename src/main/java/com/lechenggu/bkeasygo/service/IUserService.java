package com.lechenggu.bkeasygo.service;

import com.lechenggu.bkeasygo.model.User;

import java.util.List;

public interface IUserService {

    /**
     * 用户增加
     *
     * @param user 用户对象
     * @return 成功返回1   否则返回0
     */
    Integer insert(User user) throws Exception;

    /**
     * 用户修改
     *
     * @param user 用户对象
     * @return 成功返回1   否则返回0
     */
    Integer upDate(User user) throws Exception;

    /**
     * 用户删除
     *
     * @param user 用户对象
     * @return 成功返回1   否则返回0
     */
    Integer reMove(User user) throws Exception;

    /**
     * 查询所有
     *
     * @return 返回用户对象的list集合
     */
    List<User> findAll() throws Exception;

    /**
     * 根据ID查用户
     *
     * @param id 用户ID
     * @return 返回用户对象
     */
    User findById(int id) throws Exception;
}
