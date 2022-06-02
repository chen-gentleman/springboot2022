package com.chen.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * @Author @Chenxc
 * @Date 2022/6/2 14:57
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String index(Map<String,Object> model){
        model.put("data",new Date());
        model.put("message", "hello world");
        return "welcome";
    }
}
