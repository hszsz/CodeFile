package cn.com.scitc.webapp11701.dao;

import cn.com.scitc.webapp11701.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends CrudRepository<Student,Integer> {
}
