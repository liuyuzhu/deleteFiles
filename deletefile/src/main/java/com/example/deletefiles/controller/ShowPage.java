package com.example.deletefiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 显示页面
 */
@Controller("/")
public class ShowPage {

    @GetMapping("/")
    public String showIndex(){
        return "index";
    }

}
