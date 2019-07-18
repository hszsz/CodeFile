package cn.scitc.crud1.controller;

import cn.scitc.crud1.dao.StudentDao;
import cn.scitc.crud1.entity.Basicinformationclass2EnEntity;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    private Log log = LogFactory.getLog("huahua");

    private @Autowired
    StudentDao studentDao;

    @RequestMapping({"/", "/student/list"})
    public String index(Model model) {
        Iterable<Basicinformationclass2EnEntity> iterable = studentDao.findAll();
        model.addAttribute("iter", iterable);
        return "index";
    }

    @PostMapping("/studetn/edit")
    public String update(String name, String sex, String id, String age, String classs) {
        Basicinformationclass2EnEntity up = new Basicinformationclass2EnEntity();
        up.setName(name);
        up.setSex(sex);
        up.setId(id);
        up.setAge(age);
        up.setClazz(classs);
        studentDao.save(up);
        return "redirect:/";
    }

    @GetMapping("/student/delete")
    public String delete(String id) {
//        log.info("待删除的学生学号："+ id);
        studentDao.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/student/add")
    public String add(){
        return "add/index";
    }


}
