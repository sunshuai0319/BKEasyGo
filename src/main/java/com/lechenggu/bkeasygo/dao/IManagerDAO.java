package com.lechenggu.bkeasygo.dao;

import org.apache.ibatis.annotations.Param;

public interface IManagerDAO {
    /**
     * 管理员登录
     *
     * @param managerName 用户名
     * @param managerPass 密码
     * @return 存在返回1   否则返回0
     */
    int loginByManager(@Param("managerName") String managerName, @Param("managerPass") String managerPass);

}
