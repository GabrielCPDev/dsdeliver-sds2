package com.gabriel.dsdeliver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.dsdeliver.dto.OrderDTO;
import com.gabriel.dsdeliver.dto.ProductDTO;
import com.gabriel.dsdeliver.services.OrderService;
import com.gabriel.dsdeliver.services.ProductService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<OrderDTO>> findAll (){
	List<OrderDTO> list =  service.findAll();
	return ResponseEntity.ok().body(list);
	}
}
