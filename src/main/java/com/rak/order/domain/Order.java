package com.rak.order.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="ORDERS")
public class Order {
	@Id
	@GeneratedValue
	private long oid;
	
	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="order_date")
	private LocalDate orderDate;
	
	@Column(name="shipping_address")
	private String shippingAddress;
	
	@Column(name="total")
	private long total;
	public Order(){}
	public Order(String customerName, LocalDate orderDate, String shippingAddress,
			long total) {
		super();
		this.customerName = customerName;
		this.orderDate = orderDate;
		this.shippingAddress = shippingAddress;
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
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public long getOid() {
		return oid;
	}
	public void setOid(long oid) {
		this.oid = oid;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", customerName=" + customerName + ", orderDate=" + orderDate
				+ ", shippingAddress=" + shippingAddress + ", total=" + total + "]";
	}
	
	
}
