package com.chen.boot.web;

import com.chen.boot.model.User;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
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


    /**
     * @Valid 参数前⾯添加 @Valid 注解，代表此对象使⽤了参数校验；
     * BindingResult 参数校验的结果会存储在此对象中，可以根据属性判断是否校验通过，校验不通过可以将
     * 错误信息打印出来。
     *
     * @param user
     * @param result
     */
    @RequestMapping("/saveUser")
    public List saveUser(@Valid User user, BindingResult result){
        System.out.println("user="+user);
        if(result.hasErrors()){
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError error : allErrors) {
                System.out.println(error.getCode()+"-"+error.getDefaultMessage());
            }
            return allErrors;
        }
        return null;
    }
}
