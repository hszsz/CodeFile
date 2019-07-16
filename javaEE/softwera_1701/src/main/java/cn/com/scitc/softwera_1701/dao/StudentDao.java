package cn.com.scitc.softwera_1701.dao;

import cn.com.scitc.softwera_1701.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student,Integer> {
}
