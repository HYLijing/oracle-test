package com.dongfang.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dongfang.test.entity.User;

import java.util.List;

public interface UserService extends IService<User> {
    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(User user);

    User findUserById(int id);

    List<User> selectList(User user);
}
