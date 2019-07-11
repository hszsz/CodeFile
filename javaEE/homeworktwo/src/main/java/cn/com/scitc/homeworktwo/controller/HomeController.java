package cn.com.scitc.homeworktwo.controller;

import cn.com.scitc.homeworktwo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String page(Model model){
        List<Student> list = new ArrayList<>();
        Student student = new Student();
        student.setId("17301131");
        student.setName("黄胜");
        student.setAge("21");
        list.add(student);
        model.addAttribute("list",list);
        return "home";
    }
}
