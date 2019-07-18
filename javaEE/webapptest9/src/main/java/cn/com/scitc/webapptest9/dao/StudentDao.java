package cn.com.scitc.webapptest9.dao;

import org.springframework.data.repository.CrudRepository;

import cn.com.scitc.webapptest9.model.Student;

public interface StudentDao extends CrudRepository<Student,Integer> {
}
