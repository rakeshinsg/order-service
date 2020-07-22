package com.rak.order.helper;

public class OrderItemTo {
	
	private String productCode;
	private String productName;
	private int quantity;
	private long orderId;
	
	
	public OrderItemTo(){}
	public OrderItemTo(String productCode, String productName, int quantity, long orderId) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.quantity = quantity;
		this.orderId = orderId;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	
	

}
