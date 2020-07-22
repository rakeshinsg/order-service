package com.rak.order.helper;

import java.time.LocalDate;
import java.util.List;

public class OrderTo {
	
	private String customerName;
	private LocalDate orderDate;
	private String shippingAddress;
	private List<OrderItemTo> orderItemTos;
	private long total;
	public OrderTo(){}
	public OrderTo(String customerName, LocalDate orderDate, String shippingAddress, List<OrderItemTo> orderItemTos,
			long total) {
		super();
		this.customerName = customerName;
		this.orderDate = orderDate;
		this.shippingAddress = shippingAddress;
		this.orderItemTos = orderItemTos;
		this.total = total;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public List<OrderItemTo> getOrderItemTos() {
		return orderItemTos;
	}
	public void setOrderItemTos(List<OrderItemTo> orderItemTos) {
		this.orderItemTos = orderItemTos;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
}
