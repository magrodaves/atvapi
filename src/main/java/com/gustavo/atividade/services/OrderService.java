package com.gustavo.atividade.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.atividade.entities.Order;
import com.gustavo.atividade.entities.User;
import com.gustavo.atividade.entities.Order;
import com.gustavo.atividade.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findByID(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
	public Order insert(Order obj) {
		return repository.save(obj);
	}
	
}
