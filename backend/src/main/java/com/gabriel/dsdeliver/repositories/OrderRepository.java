package com.gabriel.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabriel.dsdeliver.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
