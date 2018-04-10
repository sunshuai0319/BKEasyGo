package com.lechenggu.bkeasygo.service.impl;

import com.lechenggu.bkeasygo.exception.AppException;
import com.lechenggu.bkeasygo.model.Manager;
import com.lechenggu.bkeasygo.service.IManagerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-mybatis.xml", "classpath:spring/spring-config.xml"})
public class ManagerServiceImplTest {

    @Resource
    private IManagerService iManagerService;

    @Test
    public void login() {

        try {
            Manager manager = iManagerService.login("admin", "");
            System.out.println(manager.toString());
        } catch (AppException app) {
            app.printStackTrace();
            System.out.println(app.getMsg());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
