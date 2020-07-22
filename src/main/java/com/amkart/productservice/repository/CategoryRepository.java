package com.amkart.productservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.amkart.productservice.domain.Category;


@Repository
public interface CategoryRepository extends MongoRepository<Category, String>{
	
	public List<Category> findAll();
}
