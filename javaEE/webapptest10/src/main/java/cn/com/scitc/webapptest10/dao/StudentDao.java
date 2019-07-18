package cn.com.scitc.webapptest10.dao;

import cn.com.scitc.webapptest10.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student,Integer> {
}
