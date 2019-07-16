package cn.com.scitc.webapptest6.dao;

import cn.com.scitc.webapptest6.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student,Integer> {
}
