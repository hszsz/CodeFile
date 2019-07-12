package cn.com.scitc.homework4.controller;

import cn.com.scitc.homework4.model.Student;
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
        student.setName("caidao");
        student.setAge("23");
        student.setTel("13511112222");
        student.setSex(1);
        list.add(student);

        Student student1 = new Student();
        student1.setId("17301131");
        student1.setName("菜刀");
        student1.setAge("20");
        student1.setTel("13311112222");
        student1.setSex(0);
        list.add(student1);
        model.addAttribute("list",list);
        model.addAttribute("num1",9);
        model.addAttribute("num2",3);
     return "home";
    }
}
