package com.yh.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class TestController {
    @RequestMapping("/hello")
  //  @ResponseBody
    public String hello() {
        return "say Hello";
    }
}
