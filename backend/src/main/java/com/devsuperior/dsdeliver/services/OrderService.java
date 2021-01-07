package com.devsuperior.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsdeliver.dto.OrderDTO;
import com.devsuperior.dsdeliver.entities.Order;
import com.devsuperior.dsdeliver.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired // Spring Framework
	private OrderRepository repository;
	
	/* public ProductService(ProductRepository repository) {
		this.repository = repository;
	} */
	
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll() {
		List<Order> list = repository.findOrdersWithProducts();			
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList()); 
				// stream() disponivel a partir do java 8
 	}

}
