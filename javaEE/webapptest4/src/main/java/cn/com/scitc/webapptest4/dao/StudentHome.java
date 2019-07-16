package cn.com.scitc.webapptest4.dao;

import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student,Integer>{
    
}