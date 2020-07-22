package com.rak.order.service;

import org.springframework.stereotype.Service;

import com.rak.order.domain.Order;
import com.rak.order.exception.OrderNotFoundException;
import com.rak.order.helper.OrderHelper;
import com.rak.order.helper.OrderTo;
import com.rak.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	
	private final OrderRepository  orderRepository;
	private final OrderHelper  orderHelper;
	
	OrderServiceImpl(OrderRepository  orderRepository, OrderHelper  orderHelper) {
		this.orderRepository = orderRepository;
		this.orderHelper = orderHelper;
	}
	
	@Override
	public Order createOrder(OrderTo orderTo) throws OrderNotFoundException {
		return orderRepository.save(orderHelper.fromOrderTo(orderTo));
	}

	@Override
	public Order retrieveOrder(Long orderId) throws OrderNotFoundException {
		return orderRepository.getOrderByOid(orderId);
	}
}
