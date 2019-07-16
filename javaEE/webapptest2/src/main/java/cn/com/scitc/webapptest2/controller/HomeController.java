package cn.com.scitc.webapptest2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController{
    private String page(){
        return "main";
    }
}