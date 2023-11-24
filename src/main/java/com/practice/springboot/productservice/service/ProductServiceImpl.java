package com.practice.springboot.productservice.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.practice.springboot.productservice.entity.Product;
import com.practice.springboot.productservice.exception.ProductServiceException;
import com.practice.springboot.productservice.pojo.ProductDetail;
import com.practice.springboot.productservice.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	private static final Logger logger = Logger.getLogger(ProductServiceImpl.class.getName());
	@Autowired
//	@Qualifier("productRepository")
	ProductRepository productRepository;

	public Product create(ProductDetail productDetails) throws Exception {
		logger.info("product name is:" + productDetails.getProductName());
		if (productRepository.findByProductName(productDetails.getProductName()) != null) {
			throw new ProductServiceException("Product already exists.");
		} else {
			Product newProduct = new Product(productDetails.getProductName(), productDetails.getPrice());
			Product product = productRepository.save(newProduct);
			logger.info("Created new product.");
			return product;
		}
	}

	public void delete(long id) throws Exception {
		logger.info("Product deleted.");
		// productRepository.deleteById(id);
		try {
			productRepository.deleteById(id);
		} catch (EmptyResultDataAccessException pse) {
			logger.info("pse");
			throw new ProductServiceException("Product with id " + id + " doesnt exist");
		} catch (Exception e) {
			logger.info("e");
			throw new ProductServiceException("Product with id " + id + "cant be deleted because: " + e);
		}
	}

	public List<Product> showAll() throws Exception {
		return productRepository.findAll();
	}
}
