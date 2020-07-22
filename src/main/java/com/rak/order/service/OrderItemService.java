package com.rak.order.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.rak.order.helper.OrderItemTo;


@FeignClient(name="orderitem-service", url = "localhost:9999")
public interface OrderItemService {
	
	@PostMapping("/createOrderItem")
	public String createOrderItems(@RequestBody List<OrderItemTo> orderItemTo);
	
	@GetMapping("/getOrderItem/{orderId}")
	public List<OrderItemTo> retrieveOrderItem(@PathVariable("orderId") long orderId);	
}
