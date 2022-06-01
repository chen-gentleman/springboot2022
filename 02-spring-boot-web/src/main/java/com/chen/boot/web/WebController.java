package com.chen.boot.web;

import com.chen.boot.model.User;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author @Chenxc
 * @Date 2022/6/1 17:09
 */
@RestController

public class WebController {
    @RequestMapping(value="/getUser", method= RequestMethod.POST)
    public User getUser() {
        User user=new User();
        user.setName("⼩明");
        user.setAge(12);
        user.setPass("123456");
        return user;
    }

    @RequestMapping(value = "/getUsers",method = RequestMethod.POST)
    public List<User> getUsers() {
        List<User> users=new ArrayList<>();
        User user1=new User();
        user1.setName("neo");
        user1.setAge(30);
        user1.setPass("neo123");
        users.add(user1);
        User user2=new User();
        user2.setName("⼩明");
        user2.setAge(12);
        user2.setPass("123456");
        users.add(user2);
        return users;
    }
}
