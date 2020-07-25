package com.rak.order.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rak.order.domain.Order;
import com.rak.order.exception.ConnectionException;
import com.rak.order.exception.OrderNotFoundException;
import com.rak.order.helper.OrderHelper;
import com.rak.order.helper.OrderItemTo;
import com.rak.order.helper.OrderTo;
import com.rak.order.service.OrderItemService;
import com.rak.order.service.OrderService;

@RestController
public class OrderServiceController {
	
	@Autowired
	private OrderService service;
	
	@Autowired
	private OrderItemService orderItemService;
	
	@Autowired
	private OrderHelper orderHelper;
	
	@PostMapping("/createOrder")
	public String createOrder(@RequestBody OrderTo orderTo) throws OrderNotFoundException {
		if(orderTo != null && orderTo.getOrderItemTos() != null && orderTo.getOrderItemTos().size() > 0) {
			return orderItemService.createOrderItems(orderHelper.fromOrderTo(orderTo, service.createOrder(orderTo).getOid()));
		}
		return "Requested data is not valid";
	}
	
	@GetMapping("/getOrder/{orderId}")
	public OrderTo getOrderByOrderId(@PathVariable long orderId) throws Exception {
		Order order = service.retrieveOrder(orderId);
		System.out.println("getOrderByOrderId:"+order);
		try {
			List<OrderItemTo> orderItemTos = orderItemService.retrieveOrderItem(orderId);
			if(order != null && orderItemTos != null && orderItemTos.size() > 0) {
				return orderHelper.fromOrder(order, orderItemTos);
			} else {
				throw new OrderNotFoundException("Order id is invalid");
			}
		}catch(Exception e) {
			throw new ConnectionException("Connection is closed");
		}
		
	}
	
	@GetMapping("/test")
	public OrderTo gettest() {
		OrderTo ord = new OrderTo();
		List<OrderItemTo> ac = new ArrayList<>();
		ac.add(new OrderItemTo("M101", "Mobie", 1, 11));
		ord.setOrderItemTos(ac);
		return ord;
	}
	
	@GetMapping(value = "/getOrder")
	public OrderTo createOrder() throws OrderNotFoundException {
		System.out.println("getOrder--->");
		List<OrderItemTo> orderItemTos = new ArrayList<>();
		orderItemTos.add(new OrderItemTo("1200", "Mythene", 100,100));
		LocalDate orderDate = LocalDate.now();
		OrderTo order = new OrderTo("Rakesh", orderDate, "Sinapore", orderItemTos, 10);
		
		return order;
	}
}
