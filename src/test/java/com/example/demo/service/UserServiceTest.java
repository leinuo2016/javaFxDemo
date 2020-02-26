package com.example.demo.service;

import com.example.demo.BaseTest;
import com.example.demo.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;

import static org.junit.Assert.*;

/**
 * Create by leinuo on 19-9-2 上午11:20
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public class UserServiceTest extends BaseTest {

    @Autowired
    private UserService userService;
    @Test
    public void save(){
        String name = "leinuo";
        String password = DigestUtils.md5DigestAsHex("123456".getBytes());
        User user = new User(name,password);
        userService.saveAndFlush(user);
        user = userService.findByName(name);
        assertNotNull(user);
        assertEquals(user.getUsername(),name);
    }
}