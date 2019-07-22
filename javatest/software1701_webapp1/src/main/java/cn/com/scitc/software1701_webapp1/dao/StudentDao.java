package cn.com.scitc.software1701_webapp1.dao;

import cn.com.scitc.software1701_webapp1.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student,Integer> {
}
