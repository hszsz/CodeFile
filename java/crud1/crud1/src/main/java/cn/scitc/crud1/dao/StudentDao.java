package cn.scitc.crud1.dao;

import cn.scitc.crud1.entity.Basicinformationclass2EnEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Basicinformationclass2EnEntity,String> {
}
