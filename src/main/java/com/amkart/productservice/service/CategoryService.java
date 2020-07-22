package com.amkart.productservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.amkart.productservice.domain.Category;

@Service("categoryService")
public interface CategoryService {

	public List<Category> findAll();
}
