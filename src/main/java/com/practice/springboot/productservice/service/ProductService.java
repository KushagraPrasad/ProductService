package com.practice.springboot.productservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.springboot.productservice.entity.Product;
import com.practice.springboot.productservice.pojo.ProductDetail;

@Service
public interface ProductService {

	public Product create(ProductDetail product) throws Exception;

	public void delete(String id) throws Exception;

	public List<Product> showAll() throws Exception;
}
