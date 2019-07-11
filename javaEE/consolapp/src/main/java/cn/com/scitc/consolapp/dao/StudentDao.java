package cn.com.scitc.consolapp.dao;

import cn.com.scitc.consolapp.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends CrudRepository<Student,Integer> {
}