package com.dongfang.test.controller;

import com.dongfang.test.entity.User;
import com.dongfang.test.mapper.UserMapper;
import com.dongfang.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/{id}")
    public User selById(@PathVariable int id){
        return userService.findUserById(id);
    }
    @GetMapping()
    public List<User> selUser(){
        return userService.selectList(null);
    }
    @PostMapping()
    public void addUser(@RequestBody User user){
        userService.insertUser(user);
    }
    @PutMapping()
    public void updateUser(@RequestBody User user){
        userService.insertUser(user);
    }
    @DeleteMapping()
    public void delUser(User user){
        userService.deleteUser(user);
    }


    @GetMapping("/queryUser")
    public List<User> queryUser(@RequestParam String key){

        List<User> list = userMapper.getUserByKey(key);

        return list;
    }




}
