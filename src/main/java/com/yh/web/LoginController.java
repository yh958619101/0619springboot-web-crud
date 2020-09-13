package com.yh.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {
    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String login(String username, String password, HttpServletRequest request, HttpSession session){
        System.out.println("login");
        if(username.equals("admin")&&password.equals("123456")){
            session.setAttribute("user",username);
            return "redirect:/main.html";
        }else{
            request.setAttribute("msg","用户名或密码错误！");
            return "login";
        }


    }

}

