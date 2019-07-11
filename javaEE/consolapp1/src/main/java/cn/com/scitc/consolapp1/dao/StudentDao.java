package cn.com.scitc.consolapp1.dao;

import cn.com.scitc.consolapp1.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  StudentDao extends CrudRepository<Student,Integer> {
}
