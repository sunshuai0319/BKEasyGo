package com.lechenggu.bkeasygo.dao;

import com.lechenggu.bkeasygo.model.Manager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-mybatis.xml"})//配置文件地址需正确
public class IManagerDAOTest {

    @Resource
    private IManagerDAO iManagerDAO;

    @Test
    public void loginByManager() {

        Manager manager = iManagerDAO.loginByManager("admin", "admin");
        System.out.println("manager=" + manager.toString());
    }
}