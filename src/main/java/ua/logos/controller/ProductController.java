package ua.logos.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.logos.entity.Product;
import ua.logos.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/add-product")
	public String addProduct() {
		return "product/add-product";
	}
	
	@PostMapping("/add-product")
	public String saveProduct(
			@RequestParam("productName") String productName,
			@RequestParam("productDescription") String productDescription,
			@RequestParam("productPrice") String productPrice
			) {
		System.out.println(">" + productName + " " + productDescription + " " + productPrice);
		
		Product product = new Product();
		product.setName(productName);
		product.setDescription(productDescription);
		product.setPrice(new BigDecimal(productPrice + ".00"));
		
		productService.saveProduct(product);
		
		return "redirect:/";
	}
}
