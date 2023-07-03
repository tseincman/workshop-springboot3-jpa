package com.tmseincman.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tmseincman.crud.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
