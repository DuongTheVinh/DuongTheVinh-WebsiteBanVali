package model;

import java.math.BigDecimal;

public class OrderDetail {
    private int orderDetailID;
    private int orderID;
    private int productID;
    private int quantity;
    private BigDecimal unitPrice;
	public OrderDetail() {
		super();
	}
	public OrderDetail(int orderDetailID, int orderID, int productID, int quantity, BigDecimal unitPrice) {
		super();
		this.orderDetailID = orderDetailID;
		this.orderID = orderID;
		this.productID = productID;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	public int getOrderDetailID() {
		return orderDetailID;
	}
	public void setOrderDetailID(int orderDetailID) {
		this.orderDetailID = orderDetailID;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

    // Getters and setters
}
