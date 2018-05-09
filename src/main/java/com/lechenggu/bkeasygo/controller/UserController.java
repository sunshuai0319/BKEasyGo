package com.lechenggu.bkeasygo.controller;

import com.lechenggu.bkeasygo.model.User;
import com.lechenggu.bkeasygo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
//使用@ModelAttribute注解直接从session中获取管理员的ID
// 必须同时引入@SessionAttributes注解
@SessionAttributes({"id"})
public class UserController {

    @Autowired
    private IUserService iUserService;

    /**
     * 日期格式化    前台传入的日期格式为string,
     * spring必须格式化后使用mybatis存入数据库对应的Date字段
     * 否则会报错
     *
     * @param binder
     */
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    /**
     * 用户新增
     *
     * @param userName 用户名
     * @param realName 真实姓名
     * @param password 密码
     * @param sex      性别
     * @param birth    生日
     * @param cardId   身份证号码
     * @param email    电邮
     * @param phone    电话
     * @param address  地址
     * @param creatId  创建人ID
     * @param modelMap
     * @return 成功返回新增页面并提示 失败返回新增页面并提示
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestParam("userName") String userName,
                         @RequestParam("realName") String realName,
                         @RequestParam("password") String password,
                         @RequestParam("sex") int sex,
                         @RequestParam("birth") Date birth,
                         @RequestParam("cardId") String cardId,
                         @RequestParam("email") String email,
                         @RequestParam("phone") String phone,
                         @RequestParam("address") String address,

                         //直接在session中获取管理员ID并赋值给此参数
                         @ModelAttribute("id") int creatId,
                         ModelMap modelMap) {

        User user = new User(userName, realName, password, sex, birth,
                cardId, email, phone, address, 1, creatId, new Date(), creatId, new Date());
        try {
            iUserService.insert(user);
            modelMap.addAttribute("insertOk", "新增成功");
            return "useradd";
        } catch (Exception e) {
            e.printStackTrace();
            modelMap.addAttribute("insertErr", "新增失败");
            return "useradd";
        }
    }

    /**
     * 用户管理 分页展示
     *
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String selectAll(ModelMap modelMap) {
        try {
            List<User> list = iUserService.findAll();
            modelMap.addAttribute("selectAll", list);
        } catch (Exception e) {
            e.printStackTrace();
            modelMap.addAttribute("selectAllErr", "查询失败");
        }
        return null;// TODO: 2018/5/9
    }


}
