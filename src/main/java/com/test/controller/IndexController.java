package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bbb")
public class IndexController {
    @RequestMapping("/aaa")
    public String Hello(){
        System.out.println("aaa");
        return "/hello";
    }
}
