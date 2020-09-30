package com.dongfang.test.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@TableName("users")
@AllArgsConstructor
public class User {
    @TableId("user_id")
    private int userId;
    private String userName;
    private int userAge;
}
