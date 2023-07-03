package com.tmseincman.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tmseincman.crud.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
