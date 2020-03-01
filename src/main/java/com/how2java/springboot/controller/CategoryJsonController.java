package com.how2java.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.how2java.springboot.dao.CategoryDao;
import com.how2java.springboot.pojo.Category;

@RestController
public class CategoryJsonController {

	@Autowired CategoryDao categoryDao;
	//json 与reatful风格结合
		@GetMapping("/category")
		public List<Category> list(@RequestParam(value="start",defaultValue="0")int start,
				@RequestParam(value = "size", defaultValue = "5")int size){
			start=start<0?0:start;
			Sort sort = new Sort(Sort.Direction.DESC, "id");
			Pageable pageable = new PageRequest(start, size, sort);
			Page<Category> page =categoryDao.findAll(pageable);
			return page.getContent();
			
		}
		
		@GetMapping("/category/{id}")
		public Category getOne(@PathVariable("id") int id){
			
			Category c=categoryDao.getOne(id);
			return c;
			
		}
		
		@PutMapping("/category")
		public void add(@RequestBody Category category){
			System.out.println("springboot接受到浏览器以JSON格式提交的数据："+category);
		}
}
