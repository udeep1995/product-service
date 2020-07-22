package com.amkart.productservice.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amkart.productservice.domain.Category;
import com.amkart.productservice.service.CategoryService;

@RestController
@RequestMapping("/product-service")
public class CategoryController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private CategoryService categoryService;
	
	@CrossOrigin
	@RequestMapping(value = "/category/all", method = RequestMethod.GET)
	public List<Category> getAllProductCategories()
	{ 
		List<Category> cats =  categoryService.findAll();
		return cats;
	}
}
