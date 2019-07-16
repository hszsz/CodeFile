package cn.com.scitc.webapp11701.controllers;

import cn.com.scitc.webapp11701.dao.StudentDao;
import cn.com.scitc.webapp11701.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private StudentDao studentDao;
    @RequestMapping("/")
    @ResponseBody
    public String page(){
        try {
            Student student = new Student();
            student.setName("王二");
            student.setMobile("17011110111");
            student.setAddress("四川");
            student.setClassName("软件17-1");
            student.setStudentId("17301112");
            Date birthday = Date.valueOf("1998-11-13");
            student.setBirthday(birthday);
            studentDao.save(student);
            return "success";
        }
        catch (Exception er){
            return "error"+er.getMessage();
        }
    }
}
