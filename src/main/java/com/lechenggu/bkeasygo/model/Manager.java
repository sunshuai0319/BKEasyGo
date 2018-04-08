package com.lechenggu.bkeasygo.model;

import lombok.*;

/**
 * 管理员表实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manager {

    //    主键id
    private int id;
    //    管理员名
    private String managerName;
    //    管理员密码
    private String managerPass;

}
