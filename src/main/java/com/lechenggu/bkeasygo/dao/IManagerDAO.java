package com.lechenggu.bkeasygo.dao;

import org.apache.ibatis.annotations.Param;

public interface IManagerDAO {
    /**
     * 根据传过来的用户名及密码查询表中是否存在相同数据
     * @param managerName   用户名
     * @param managerPass   密码
     * @return  存在返回1   否则返回0
     */
    int findByNameAndPass(@Param("managerName") String managerName , @Param("managerPass") String managerPass) ;

}
