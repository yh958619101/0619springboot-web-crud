package com.yh.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ThymeleafController2 {
    @RequestMapping("/test2")
    public String test(Model model) {
        model.addAttribute("name", "杨宏");
        return "demo7";
    }
}
