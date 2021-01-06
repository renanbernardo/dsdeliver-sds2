package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliver.entities.Product;

// JpaRepository - Spring
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	// Metodo auxiliar utilizando o Spring Data JPA
	List<Product> findAllByOrderByNameAsc();

}
