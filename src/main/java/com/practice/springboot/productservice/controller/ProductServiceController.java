package com.practice.springboot.productservice.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.springboot.productservice.entity.Product;
import com.practice.springboot.productservice.pojo.ProductDetail;
import com.practice.springboot.productservice.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductServiceController {

	@Autowired
	ProductService productService;

	private static final Logger logger = Logger.getLogger(ProductServiceController.class.getName());

	@PostMapping(value = "/product")
	public Product createProduct(@RequestBody ProductDetail product) throws Exception {
		logger.info("New product created: " + product);
		return productService.create(product);
	}

	@RequestMapping(value = "/product/{id}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable long id) throws Exception {
		logger.info("Product deleted with the id:" + id);
		productService.delete(id);
	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public List<Product> readAll() throws Exception {
		logger.info("Read all products");
		return productService.showAll();
	}
}
