package com.example.demo.service.impl;

import com.example.demo.dto.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description.
 *
 * @author Created by liaoliao.ma@hand-china.com
 * @version 1.0
 * @date Created on 2018/8/25
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper mapper;
    @Override
    public List<User> selectAllUser() {
        return mapper.selectAllUser();
    }
}
