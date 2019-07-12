package cn.com.scitc.homework2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.scitc.homework2.model.Student;




@Controller
public class HomeController{
    @RequestMapping("/")
    public String page(Model model){
        List<Student> list = new ArrayList<>();
        Student student = new Student();
        student.setId("17301131");
        student.setName("caidao");
        student.setAge("23");
        student.setTel("13511112222");
        student.setSex(1);
        list.add(student);
        model.addAttribute("list", list);

        return "home";
    }
}