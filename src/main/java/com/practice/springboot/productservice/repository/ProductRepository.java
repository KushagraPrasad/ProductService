package com.practice.springboot.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.practice.springboot.productservice.entity.Product;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, Long> {

	Product findByProductName(String productName);

}
