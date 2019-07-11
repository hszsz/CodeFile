package cn.com.scitc.soft1701.controller;

import cn.com.scitc.soft1701.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String page1(Model model){
        model.addAttribute("name","caidao");
        List<Student> list = new ArrayList<>();
        Student student =  new Student();
        student.setId("123456");
        student.setName("caidao");
        student.setAge("39");
        list.add(student);
        model.addAttribute("list",list);

        Student student1 =  new Student();
        student1.setId("12345645");
        student1.setName("hahah");
        student1.setAge("23");
        list.add(student1);
        model.addAttribute("list",list);


        return "home";
    }
}
