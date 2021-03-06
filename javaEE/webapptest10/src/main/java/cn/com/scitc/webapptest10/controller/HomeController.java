package cn.com.scitc.webapptest10.controller;

import cn.com.scitc.webapptest10.dao.StudentDao;
import cn.com.scitc.webapptest10.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    private @Autowired StudentDao studentDao;

    @GetMapping("/")
    private String page(Model model){
        Iterable<Student> list = studentDao.findAll();
        model.addAttribute("list",list);
        return "main";
    }
}
