package ua.logos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.logos.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	
	
}
