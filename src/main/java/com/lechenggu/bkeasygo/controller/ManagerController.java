package com.lechenggu.bkeasygo.controller;

import com.lechenggu.bkeasygo.model.Manager;
import com.lechenggu.bkeasygo.service.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller

//将ModelMap中的数据存入session中
@SessionAttributes({"id", "name"})

//@RequestMapping("/manager")
// url:模块/资源/{}/细分
public class ManagerController {

    @Autowired  //注入服务层
    private IManagerService iManagerService;

    /**
     * 管理员登录
     *
     * @param managerName 用户输入的用户名
     * @param managerPass 用户输入的密码
     * @param modelMap    将数据存放在model中,在request域中可使用
     * @return 登录成功返回index.jsp 否则报异常, 提示登录失败
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(value = "managerName", required = false) String managerName,
                        @RequestParam(value = "managerPass", required = false) String managerPass,
                        ModelMap modelMap) {

        try {
//            调用service
            Manager manager = iManagerService.login(managerName, managerPass);
            int id = manager.getId();
            String name = manager.getManagerName();
//            将管理员id name 存入modelmap
            modelMap.addAttribute("id", id);
            modelMap.addAttribute("name", name);

        } catch (Exception e) {
//            e.printStackTrace();
            modelMap.addAttribute("loginerr", "登录失败     请重新登录");
            //登录失败转发登录界面
            return "login";
        }
        //登录成功转发主页
        return "index";
    }
}
