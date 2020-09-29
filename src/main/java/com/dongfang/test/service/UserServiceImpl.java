package com.dongfang.test.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dongfang.test.entity.User;
import com.dongfang.test.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public int insertUser(User user) {
        return baseMapper.insert(user);
    }

    @Override
    public int updateUser(User user) {
        return baseMapper.updateById(user);
    }

    @Override
    public int deleteUser(User user) {
        return baseMapper.deleteById(user.getUserId());
    }

    @Override
    public User findUserById(int id) {
        System.out.println(id);
        System.out.println(baseMapper.selectById(id));
        return baseMapper.selectById(id);
    }

    @Override
    public List<User> selectList(User user) {
        return baseMapper.selectList(null);
    }
}
