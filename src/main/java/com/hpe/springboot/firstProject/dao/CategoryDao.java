package com.hpe.springboot.firstProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hpe.springboot.firstProject.entity.Category;

public interface CategoryDao extends JpaRepository<Category, Integer> {

}
