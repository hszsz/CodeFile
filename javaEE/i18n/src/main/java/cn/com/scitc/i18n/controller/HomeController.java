package cn.com.scitc.i18n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController{
@GetMapping("/")
private String page(Model model){
    private String name;
    name = "hello world!";
    model.addAttribute("home",name);
    return "home";
}
}