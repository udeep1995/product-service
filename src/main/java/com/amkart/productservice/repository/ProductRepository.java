package com.amkart.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.amkart.productservice.domain.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
