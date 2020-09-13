package com.yh.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {
    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("name", "杨宏");
        return "demo6";
    }
}
