package cn.com.scitc.software1701_webapp1.controllers;

import cn.com.scitc.software1701_webapp1.dao.StudentScoreDao;
import cn.com.scitc.software1701_webapp1.model.Studentscore;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/studentScore")
public class StudentScoreController {
    private  @Autowired StudentScoreDao studentScoreDao;
    private Log log = LogFactory.getLog(getClass());
    @GetMapping("/list")
    private String page(Model model){
        Iterable<Studentscore> list = studentScoreDao.findAll();
        model.addAttribute("list",list);
        return "studentScore/list";
    }
    @GetMapping("/edit")
    private String edit(Model model,Integer id){
        log.info("将要显示edit页面");
        Optional<Studentscore> byId = studentScoreDao.findById(id);
        model.addAttribute("studentScore", byId.get());
        return "studentScore/edit";
    }
    @PostMapping("/update")
    private String update(Studentscore studentscore){
        log.info("id="+studentscore.getId());
        studentScoreDao.save(studentscore);
        log.info("course save success");
        return  "redirect:/studentScore/list";
    }
    @RequestMapping("/new")
    private String New(){
        log.info("将要显示new页面");
        return "studentScore/new";
    }
    @RequestMapping("/create")
    private String create(Studentscore studentscore){
        studentScoreDao.save(studentscore);
        log.info("StudentScore save success");
        return  "redirect:/studentScore/list";
    }
    @RequestMapping("/delect")
    private  String delect(Integer id){
        studentScoreDao.deleteById(id);
        return "redirect:/studentScore/list";
    }
}
