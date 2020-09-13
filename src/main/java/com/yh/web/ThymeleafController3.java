package com.yh.web;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ThymeleafController3 {
    @RequestMapping("/test3")
    public String test(Model model) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "zs");
        map.put("age", 18);
        model.addAttribute("person", map);
        return "test3";

    }

    @RequestMapping("/test4")
    public String test2(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("name", "zhangsan");
        return "test4";
    }

    @RequestMapping("/test5")
    public String test5(Model model) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("id", 001);
        model.addAttribute("o", map);
        model.addAttribute("orderId", "o123");
        return "test5";
    }
}
