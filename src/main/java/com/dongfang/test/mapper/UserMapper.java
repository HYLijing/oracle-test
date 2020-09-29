package com.dongfang.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dongfang.test.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User>{

    List<User> getUserByKey(@Param("key")String key);

}
