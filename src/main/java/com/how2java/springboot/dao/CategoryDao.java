package com.how2java.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.how2java.springboot.pojo.Category;

public interface CategoryDao extends JpaRepository<Category,Integer>{

}
