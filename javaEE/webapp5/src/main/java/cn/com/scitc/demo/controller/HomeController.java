package cn.com.scitc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String page() {
         return "main";
    }
    @RequestMapping("/home")
    public String page1() {
         return "home";
    }
}
