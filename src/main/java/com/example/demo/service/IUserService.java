package com.example.demo.service;
import com.example.demo.dto.User;
import com.sun.tools.javac.util.List;
/**
 * description.
 *
 * @author Created by liaoliao.ma@hand-china.com
 * @version 1.0
 * @date Created on 2018/8/25
 */
public interface IUserService {

    List<User> selectAllUser();
}
