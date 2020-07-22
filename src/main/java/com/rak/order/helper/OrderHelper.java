package com.rak.order.helper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.rak.order.domain.Order;

@Component
public class OrderHelper {
	
	public Order fromOrderTo(OrderTo orderTo) {
		return new Order(orderTo.getCustomerName(), LocalDate.now(), orderTo.getShippingAddress(), orderTo.getTotal());
	}
	
	public List<OrderItemTo> fromOrderTo(OrderTo orderTo, long orderId) {
		List<OrderItemTo> itemTos = new ArrayList<>();
		List<OrderItemTo> orderItemTos = orderTo.getOrderItemTos();
		orderItemTos.forEach(oi -> {
			itemTos.add(new OrderItemTo(oi.getProductCode(), oi.getProductCode(), oi.getQuantity(), orderId));
		});
		return itemTos;
	}
	
	public OrderTo fromOrder(Order order, List<OrderItemTo> orderItemTos) {
			OrderTo orderTo = new OrderTo(order.getCustomerName(), order.getOrderDate(), order.getShippingAddress(), null, order.getTotal());
			orderTo.setOrderItemTos(orderItemTos);
			return orderTo;
	}
}
