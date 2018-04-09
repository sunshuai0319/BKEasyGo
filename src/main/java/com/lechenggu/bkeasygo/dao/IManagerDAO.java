package com.lechenggu.bkeasygo.dao;

import com.lechenggu.bkeasygo.model.Manager;
import org.apache.ibatis.annotations.Param;

public interface IManagerDAO {
    /**
     * 管理员登录
     *
     * @param managerName 用户名
     * @param managerPass 密码
     * @return 存在返回1   否则返回0
     * mybatis查询字段为int类型无数据会返回0报错,改为integer类型返回null
     */
    Manager loginByManager(@Param("managerName") String managerName,
                           @Param("managerPass") String managerPass);

}
