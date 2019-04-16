package com.q.courses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zjl
 * @Date 2019/4/9 23:28
 */
@Controller
public class HomeController {
    @GetMapping(value = {"/", "/index"})
    public String index() {
        return "login";
    }
}
