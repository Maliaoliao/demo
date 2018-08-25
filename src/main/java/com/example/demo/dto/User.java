package com.example.demo.dto;

import lombok.Data;

/**
 * 芬旅用户.
 *
 * @author Created by liaoliao.ma@hand-china.com
 * @version 1.0
 * @date Created on 2018/8/25
 */

@Data
public class User {

    private int id;

    private String name;

    private String email;

    private String phone;

    private String pwd;
}
