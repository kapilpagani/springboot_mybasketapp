package com.hpe.springboot.firstProject.dao;

import org.springframework.data.repository.CrudRepository;
import com.hpe.springboot.firstProject.entity.Brand;

public interface BrandDao extends CrudRepository<Brand, Integer> {

}
