package cn.com.scitc.software1701_webapp1.dao;

import cn.com.scitc.software1701_webapp1.model.Studentscore;
import org.springframework.data.repository.CrudRepository;

public interface StudentScoreDao extends CrudRepository<Studentscore,Integer> {
}
