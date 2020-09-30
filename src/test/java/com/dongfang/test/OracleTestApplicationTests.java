package com.dongfang.test;

import com.dongfang.test.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OracleTestApplicationTests {


    @Autowired
    private UserService userService;


    @Test
    void contextLoads() {

        userService.test();


    }

}
