package ua.logos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.logos.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/product/add-product")
	public String addProduct() {
		return "product/add-product";
	}
	
	@PostMapping("/product/add-product")
	public String saveProduct(
			@RequestParam("productName") String productName,
			@RequestParam("productDescription") String productDescription,
			@RequestParam("productPrice") String productPrice
			) {
		System.out.println(">" + productName + " " + productDescription + " " + productPrice);
		return "redirect:/";
	}
}
