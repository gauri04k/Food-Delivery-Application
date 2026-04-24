package com.tka.april24;

import java.util.List;  //ctr + shift + o

public class Order {
      private int orderId;
      private Customer customer;
      private List <Product> productList;
      private double totalAmount;
      
      
	  public Order() {
		super();
	  }


	  public Order(int orderId, Customer customer, List<Product> productList, double totalAmount) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.productList = productList;
		this.totalAmount = totalAmount;
	  }


	  public int getOrderId() {
		  return orderId;
	  }


	  public void setOrderId(int orderId) {
		  this.orderId = orderId;
	  }


	  public Customer getCustomer() {
		  return customer;
	  }


	  public void setCustomer(Customer customer) {
		  this.customer = customer;
	  }


	  public List<Product> getProductList() {
		  return productList;
	  }


	  public void setProductList(List<Product> productList) {
		  this.productList = productList;
	  }


	  public double getTotalAmount() {
		  return totalAmount;
	  }


	  public void setTotalAmount(double totalAmount) {
		  this.totalAmount = totalAmount;
	  }


	  @Override
	  public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer + ", productList=" + productList
				+ ", totalAmount=" + totalAmount + "]";
	  }
	  
	  
      public void calculateTotalAmount() {
    	  totalAmount =0;
    	  for(Product p : productList) {
    		  totalAmount += p.getPrice();
    	  }
      }
      
}
