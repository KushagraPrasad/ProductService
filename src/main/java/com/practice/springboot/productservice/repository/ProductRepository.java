package com.practice.springboot.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.practice.springboot.productservice.entity.Product;

@Repository
@Transactional
public interface ProductRepository extends MongoRepository<Product, String> {

	Object findByProductName(String productName);

}
