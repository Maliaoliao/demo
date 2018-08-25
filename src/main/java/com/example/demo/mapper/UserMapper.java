package com.example.demo.mapper;

import com.example.demo.dto.User;
import com.sun.tools.javac.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * 芬旅用户.
 *
 * @author Created by liaoliao.ma@hand-china.com
 * @version 1.0
 * @date Created on 2018/8/25
 */
@Mapper
public interface UserMapper {

    /**
     * 查询用户信息
     * @return
     */
    List<User> selectAllUser();
}
