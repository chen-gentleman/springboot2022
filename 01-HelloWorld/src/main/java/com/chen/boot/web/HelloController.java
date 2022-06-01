package com.chen.boot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author @Chenxc
 * @Date 2022/6/1 15:21
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String name,String age){
        return "hello world!" + name + ",age=" + age;
    }
}
