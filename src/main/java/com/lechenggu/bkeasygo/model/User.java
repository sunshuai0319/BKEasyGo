package com.lechenggu.bkeasygo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户表
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    //    用户id    自增
    private int id;
    //    用户名
    private String userName;
    //    真实姓名
    private String realName;
    //    用户密码
    private String password;
    //    性别
    private int sex;
    //    生日
    private String birth;
    //    身份证号
    private String cardId;
    //    电邮
    private String email;
    //    电话
    private String phone;
    //    地址
    private String address;
    //    是否锁定
    private int Ifnot;
    //    创建人id
    private int creatId;
    //    创建日期
    private Date creatTime;
    //    修改人id
    private int modifyId;
    //    修改时间
    private Date modifyTime;

    public User(String userName, String realName, String password,
                int sex, String birth, String cardId, String email,
                String phone, String address, int ifnot, int creatId,
                Date creatTime, int modifyId, Date modifyTime) {
        this.userName = userName;
        this.realName = realName;
        this.password = password;
        this.sex = sex;
        this.birth = birth;
        this.cardId = cardId;
        this.email = email;
        this.phone = phone;
        this.address = address;
        Ifnot = ifnot;
        this.creatId = creatId;
        this.creatTime = creatTime;
        this.modifyId = modifyId;
        this.modifyTime = modifyTime;
    }
}
