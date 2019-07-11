package cn.com.scitc.homework.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/aa")
public class HomeController {
    @RequestMapping("/bb")
    public String page(){
        return "home";
    }
}
