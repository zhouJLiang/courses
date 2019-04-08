package com.q.courses.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zjl
 * @Date: 2019/4/8 15:50
 */
@RestController
public class HelloController {
    @RequestMapping("/index")
    public String index(){
        return "Hello world";
    }
}
