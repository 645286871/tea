package com.how2java.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.how2java.springboot.dao.CategoryDao;
import com.how2java.springboot.pojo.Category;

@Controller
public class CategoryContorller{
    @Autowired
	CategoryDao categoryDao;
	
    /*@RequestMapping("/listCategory")
	public String listCategory(Model m,@RequestParam(value = "start", defaultValue = "0") int start,
			@RequestParam(value = "size", defaultValue = "5") int size){
    	
    	start = start<0?0:start;
    	Sort sort = new Sort(Sort.Direction.DESC, "id");
    	Pageable pageable = new PageRequest(start, size, sort);
    	
    	Page<Category> page=categoryDao.findAll(pageable);
    	m.addAttribute("page", page);
		return "listCategory";
	}
    
    @RequestMapping("/addCategory")
    public String addCategory(Category c){
    	
    	categoryDao.save(c);
    	
    	return "redirect:listCategory";
    	
    }
    
    @RequestMapping("/deleteCategory")
    public String deleteCategory(Category c){
    	
    	categoryDao.delete(c);
    	return "redirect:listCategory";
    }
    
    @RequestMapping("/updateCategory")
    public String updateCategory(Category c){
    	categoryDao.save(c);
    	return "redirect:listCategory";
    }
    
    @RequestMapping("/editCategory")
    public String ediitCategory(int id,Model m) throws Exception {
        Category c= categoryDao.getOne(id);
        m.addAttribute("c", c);
        return "editCategory";
    }*/
    
 
    
    
}
