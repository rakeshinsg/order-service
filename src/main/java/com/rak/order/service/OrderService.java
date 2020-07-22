package com.rak.order.service;

import com.rak.order.domain.Order;
import com.rak.order.exception.OrderNotFoundException;
import com.rak.order.helper.OrderTo;

public interface OrderService {
	public Order createOrder(OrderTo orderTo) throws OrderNotFoundException ;
	public Order retrieveOrder(Long orderId) throws OrderNotFoundException ;
}
