package com.xoriant.ecart.model;

public class Order {

	private int orderId;
	private int productId;
	private int userId;
	private double total;
	private String transactionId;
	private String paymentStatus;

	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	public Order(int orderId, int productId, int userId, double total, String transactionId, String paymentStatus) {		this.orderId = orderId;
		this.productId = productId;
		this.userId = userId;
		this.total = total;
		this.transactionId = transactionId;
		this.paymentStatus = paymentStatus;
	}




	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

}
