package cn.com.scitc.software1701_webapp1.dao;

import cn.com.scitc.software1701_webapp1.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Course,Integer> {
}
