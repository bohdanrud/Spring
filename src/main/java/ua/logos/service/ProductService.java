package ua.logos.service;

import java.util.List;

import ua.logos.entity.Product;

public interface ProductService {
 
	void saveProduct(Product product);
	
	List<Product> findAllProducts();
	
	Product findProductById(int id);
	
}
