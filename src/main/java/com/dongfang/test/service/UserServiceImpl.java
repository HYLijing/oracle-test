package com.dongfang.test.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dongfang.test.entity.User;
import com.dongfang.test.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    @Transactional
    public int insertUser(User user) {
        return baseMapper.insert(user);
    }

    @Override
    @Transactional
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

    @Override
    public void test() {
        User user = new User(1, "终极赵无极", 18);
        User user1 = new User(11, "葫芦娃救爷爷", 188);

        this.updateUser(user);

        this.insertUser(user1);
    }


}
