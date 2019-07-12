package cn.com.scitc.homework3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController{
    @RequestMapping("/")
    public String page(){
    return "home";
}
}