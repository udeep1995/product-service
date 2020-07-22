package com.amkart.productservice.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amkart.productservice.domain.Category;
import com.amkart.productservice.repository.CategoryRepository;
import com.amkart.productservice.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{

	private static final Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);
	
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<Category> findAll() {
		List<Category> categories = categoryRepository.findAll();
		for(Category cat : categories) {
			logger.info(cat.toString());	
		}
		logger.info("Total categories "+ categories.size());
		return categories;
	}

}
