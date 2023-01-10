package com.gcu.model;

public class OrderModel
{
	
	private long id;
	private String orderNo, productName;
	private float price;
	private int quantity;
	
	public OrderModel(long id, String orderNo, String productName, float price, int quantity) 
	{
		this.id = id;
		this.orderNo = orderNo;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public Long getId() 
	{
		return id;
	}
	
	public void setId(Long id) 
	{
		this.id = id;
	}
	
	public String getOrderNo() 
	{
		return orderNo;
	}
	
	public void setOrderNo(String orderNo) 
	{
		this.orderNo = orderNo;
	}
	
	public String getProductName() 
	{
		return productName;
	}
	
	public void setProductName(String productName) 
	{
		this.productName = productName;
	}
	
	public Float getPrice() 
	{
		return price;
	}
	
	public void setPrice(Float price) 
	{
		this.price = price;
	}
	
	public int getQuantity() 
	{
		return quantity;
	}
	
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	
	
}