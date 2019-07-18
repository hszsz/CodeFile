package cn.com.scitc.webapptest8.dao;

import cn.com.scitc.webapptest8.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student,Integer> {
}
