package com.lechenggu.bkeasygo.service.impl;

import com.lechenggu.bkeasygo.model.Manager;
import com.lechenggu.bkeasygo.service.IManagerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml", "classpath:spring-config.xml"})
public class ManagerServiceImplTest {

    @Resource
    IManagerService iManagerService;

    @Test
    public void login()  throws Exception{


        Manager manager = null;
        try {
            manager = iManagerService.login("admin","");
            System.out.println(manager.toString());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }


        }

    }
