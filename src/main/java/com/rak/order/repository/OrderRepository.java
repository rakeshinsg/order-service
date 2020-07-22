package com.rak.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rak.order.domain.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	public Order getOrderByOid(Long oid);
}
