package cn.com.scitc.apptest1.dao;

import cn.com.scitc.apptest1.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student,Integer> {
}
