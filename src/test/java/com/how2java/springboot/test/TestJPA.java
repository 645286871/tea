package com.how2java.springboot.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.how2java.springboot.Application;
import com.how2java.springboot.dao.CategoryDao;
import com.how2java.springboot.pojo.Category;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestJPA {
  
	 @Autowired
	 CategoryDao categoryDao;
	 
	 @Test
	 public void test1(){
		 List<Category> cs=categoryDao.findAll();
		 
		 for (Category c:cs) {
			System.out.println("name:"+c.getName());
			
		}
	 }
	 @Test
	    public void test2() {
	        System.out.println("查询名称是 \"category 1 \"的分类:");
	        List<Category> cs=  categoryDao.findByName("9999999");
	        for (Category c : cs) {
	            System.out.println("c.getName():"+ c.getName());
	        }
	        System.out.println();
	    }
}
