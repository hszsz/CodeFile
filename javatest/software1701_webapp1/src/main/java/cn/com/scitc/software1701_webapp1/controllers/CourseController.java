package cn.com.scitc.software1701_webapp1.controllers;

import cn.com.scitc.software1701_webapp1.dao.CourseDao;
import cn.com.scitc.software1701_webapp1.model.Course;
import cn.com.scitc.software1701_webapp1.model.Student;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.Optional;

@Controller
@RequestMapping("/course")
public class CourseController {
    private  @Autowired CourseDao courseDao;
    private Log log = LogFactory.getLog(getClass());
    @GetMapping("/list")
    private String page(Model model){
        Iterable<Course> list = courseDao.findAll();
        model.addAttribute("list",list);
        return "course/list";
    }
    @GetMapping("/edit")
    private String edit(Model model,Integer id){
        log.info("将要显示edit页面");
        Optional<Course> byId = courseDao.findById(id);
        model.addAttribute("course", byId.get());
        return "course/edit";
    }
    @PostMapping("/update")
    private String update(Integer id, String name, BigDecimal courseScore, int courseTime, String courseType){
        log.info("id"+id);
        Optional<Course> byId = courseDao.findById(id);
        Course course= byId.get();
        course.setId(id);
        course.setName(name);
        course.setCourseScore(courseScore);
        course.setCourseTime(courseTime);
        course.setCourseType(courseType);
        courseDao.save(course);
        log.info("course save success");
        return  "redirect:/course/list";
    }
    @RequestMapping("/new")
    private String New(){
        log.info("将要显示create页面");
        return "course/new";
    }
    @RequestMapping("/create")
    private String create(Course course){
        courseDao.save(course);
        log.info("course save success");
        return  "redirect:/course/list";
    }

    @RequestMapping("/delete")
    private String Delete(Integer id){
        courseDao.deleteById(id);
        return "redirect:/course/list";

    }
}
