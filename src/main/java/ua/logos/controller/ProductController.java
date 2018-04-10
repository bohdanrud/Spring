package ua.logos.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/products")
	public String showProducts(Model model) {
		
//		List<Product> products = productService.findAllProducts();
//		model.addAttribute("prodictsList",products);
		
		model.addAttribute("prodictsList", productService.findAllProducts());
		model.addAttribute("pageTitle", "Products page");
		return "product/products";
	}
	
	@GetMapping("/{productId}")
	public String showProductById(
			@PathVariable("productId") int productId,
			Model model
			) {
		System.out.println("ID: " + productId);
		
		model.addAttribute("title", "Product Details");
		
//		Product product = productService.findProductById(productId);
//		model.addAttribute("productMadel", product);
		
		model.addAttribute("productModel", productService.findProductById(productId));
		
		
		return "product/product";
	}
	
	@GetMapping("/del/{productId}")
	public String deleteProductById(
			@PathVariable("productId") int id
			) {
		productService.deleteProductById(id);
		return "redirect:/product/products";
	}
	
	@GetMapping("/edit/{productId}")
	public String editProductByID(
			@PathVariable("productId") int Productid,
			Model model
			) {
		model.addAttribute("productModel", productService.findProductById(Productid));
		return "product/edit";
	}
	
	@PostMapping("/edit-product")
	public String editProduct(
			@RequestParam("productName") String productName,
			@RequestParam("productDescription") String productDescription,
			@RequestParam("productPrice") String productPrice,
			@RequestParam("productId") String productIdStr
			) {
		System.out.println(">" + productName + " " + productDescription + " " + productPrice);
		
		Product product = new Product();
		product.setId(Integer.valueOf(productIdStr));
		product.setName(productName);
		product.setDescription(productDescription);
		product.setPrice(new BigDecimal(productPrice + ".00"));
		
		productService.saveProduct(product);
		
		return "redirect:/";
	}
}
