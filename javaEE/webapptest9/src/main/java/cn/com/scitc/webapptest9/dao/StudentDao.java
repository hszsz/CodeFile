package cn.com.scitc.webapptest9.dao;

import cn.com.scitc.webapptest9.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student,Integer> {
}
