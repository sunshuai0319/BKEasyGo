package com.lechenggu.bkeasygo.controller;

import com.lechenggu.bkeasygo.exception.AppException;
import com.lechenggu.bkeasygo.model.Manager;
import com.lechenggu.bkeasygo.service.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/manager") //url:模块/资源/{}/细分
public class ManagerController {

    @Autowired
    private IManagerService iManagerService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(value = "managerName", required = false) String managerName,
                        @RequestParam(value = "managerPass", required = false) String managerPass) {

        try {
            Manager manager = iManagerService.login(managerName, managerPass);

        } catch (AppException e) {
            e.printStackTrace();
            String msg = "错误信息" + e.getMessage() + "错误代码" + e.getCode();
        }
        return "index";
    }
}
