package cn.com.scitc.webapptest2.dao;
import org.springframework.data.repository.CrudRepository;

import cn.com.scitc.webapptest2.model.Student;

public interface StudentDao extends CrudRepository<Student, Integer> {   
}