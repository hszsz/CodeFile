package cn.com.scitc.webapptest1.dao;

import cn.com.scitc.webapptest1.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student,Integer> {
}
