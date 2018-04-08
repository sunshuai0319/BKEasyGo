package com.lechenggu.bkeasygo.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring_mybatis.xml"})
public class IManagerDAOTest {

    @Resource
    private IManagerDAO iManagerDAO;

    @Test
    public void loginByManager() {

        int i = iManagerDAO.loginByManager("admin", "admin");
        System.out.println(i);
    }
}