package cn.com.scitc.homework1.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.scitc.homework1.model.Student;

@Controller
public class HomeController{
    
    
    @RequestMapping("/")
    public String page(Model model){
    List<Student> list = new ArrayList<>();
    Student student = new Student();
    student.setId("17301131");
    student.setName("菜刀");
    student.setAge("23");
    student.setTel("17311112222");
    student.setSex(2);
    list.add(student);

    Student student1 = new Student();
    student1.setId("17301131");
    student1.setName("caidao");
    student1.setAge("22");
    student1.setTel("13511112222");
    student1.setSex(1);
    list.add(student1);
    model.addAttribute("list",list);

    model.addAttribute("num1",9);
    model.addAttribute("num2",3);
    return "home";
}
@RequestMapping("/aa")
public String page1(Model model){ 
    List<Student> list = new ArrayList<>();
    Student student = new Student();
    student.setId("17301131");
    student.setName("菜刀");
    student.setAge("23");
    student.setTel("17311112222");
    student.setSex(2);
    list.add(student);

    Student student1 = new Student();
    student1.setId("17301131");
    student1.setName("caidao");
    student1.setAge("22");
    student1.setTel("13511112222");
    student1.setSex(1);
    list.add(student1);
    model.addAttribute("list",list);

    model.addAttribute("num1",9);
    model.addAttribute("num2",3);
return "home";
}


}