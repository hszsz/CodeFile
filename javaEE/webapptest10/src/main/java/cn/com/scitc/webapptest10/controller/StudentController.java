package cn.com.scitc.webapptest10.controller;

import cn.com.scitc.webapptest10.dao.StudentDao;
import cn.com.scitc.webapptest10.model.Student;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.util.Optional;

@Controller
@RequestMapping("/student")
public class StudentController {
    private Log log = LogFactory.getLog(getClass());
    private @Autowired StudentDao studentDao;
    @GetMapping("/edit")
    private String edit(Model model,Integer id){
        log.info("将要显示edit页面");
        Optional<Student> studentOptional = studentDao.findById(id);
        model.addAttribute("student", studentOptional.get());
        return "student/edit";
    }
    @PostMapping("/update")
    private String update(Integer id, String studentId, String className, String name, String address, String mobile, Date birthday){
        log.info("id"+id);
        Optional<Student> byId = studentDao.findById(id);
        Student student = byId.get();
        student.setClassName(className);
        student.setName(name);
        student.setAddress(address);
        student.setMobile(mobile);
        student.setBirthday(birthday);

        studentDao.save(student);
        log.info("studennt save success");
        return  "redirect:/";
    }
    @RequestMapping("/create")
    private String create(){
        log.info("将要显示create页面");
        return "student/create";
    }
    @RequestMapping("/new")
    private String StudentNew(Integer id, String studentId, String className, String name, String address, String mobile){
        Student student = new Student();
        student.setStudentId(studentId);
        student.setClassName(className);
        student.setName(name);
        student.setAddress(address);
        student.setMobile(mobile);

        studentDao.save(student);
        return  "redirect:/";
    }
    @RequestMapping("/delete")
    private String Delete(Integer id){
        ;studentDao.deleteById(id);
        return "redirect:/";

    }
}
