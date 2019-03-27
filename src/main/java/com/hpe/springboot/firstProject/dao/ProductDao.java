package com.hpe.springboot.firstProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hpe.springboot.firstProject.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
