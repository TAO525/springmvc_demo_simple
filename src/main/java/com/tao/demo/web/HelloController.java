package com.tao.demo.web;

import com.alibaba.fastjson.JSON;
import com.tao.demo.po.UserT;
import com.tao.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author TAO
 * @Date 2017/9/10 22:22
 */
@Controller
public class HelloController {

    @Resource
    private UserService userService;

    @RequestMapping("index")
    public String hello(){
        System.out.println("hello world");
        return "index";
    }

    @RequestMapping(value = "/user",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String Random(){
        UserT userById = userService.getUserById(1);
        return "返回结果："+ JSON.toJSONString(userById);
    }

    @RequestMapping(value = "/bath")
    @ResponseBody
    public String bath(){
        userService.bath2();
        return "ok";
    }

}
