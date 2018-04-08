package com.lechenggu.bkeasygo.web;

import com.lechenggu.bkeasygo.service.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private IManagerService iManagerService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(){

        return null;// TODO: 2018/4/9
    }
}
