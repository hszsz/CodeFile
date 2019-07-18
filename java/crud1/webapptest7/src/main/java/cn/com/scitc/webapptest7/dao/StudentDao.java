package cn.com.scitc.webapptest7.dao;

import cn.com.scitc.webapptest7.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student,Integer> {

}
