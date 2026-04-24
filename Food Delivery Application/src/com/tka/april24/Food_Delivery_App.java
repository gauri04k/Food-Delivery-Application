package com.tka.april24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Food_Delivery_App {
	//Appln Entry point 
     public static void main(String args[]) {
          
    	 // ====================Product Operations===================
    	 
    	 List<Product> productList = new ArrayList<>();  //this is called dynamic dispatch
  
    	 
    	 //add product
    	 
    	 productList.add(new Product(1, "Pizza", 350));
    	 productList.add(new Product(2, "Pasta", 150));
    	 productList.add(new Product(3, "Fries", 250)); 
    	 productList.add(new Product(4, "ColdDrink", 100));
    	 productList.add(new Product(5, "Burger", 80));
    	 
    	 System.out.println("All Prodcuts :");
    	 productList.forEach(System.out::
    		 println);
    	 
    	 //price > 200
    	 
    	 System.out.println("\nProduct with price > 200 :");
    	 for(Product p: productList) {
    		 if(p.getPrice() > 200)
    			 System.out.println(p);
    	 }
    	 
    	 // Name contains "zza"
    	 
    	 System.out.println("\nProdcuts containing 'zza':");
    	 for(Product p: productList) {
    		 if(p.getName().toLowerCase().contains("zza"))
    			 System.out.println(p);
    	 }
    	 
    	 // sort ascending using comparator
    	 
    	 productList.sort(Comparator.comparing(Product::getPrice));
    	 System.out.println("\nSorted Products:");
    	 productList.forEach(System.out::println);
    	 
    	 // ======================Customer Operations==========================
    	 
    	 List<Customer> customerList = new ArrayList<>();
    	 
    	 customerList.add(new Customer(1, "Gauri", "Nashik"));
    	 customerList.add(new Customer(2, "Rama", "Solapur"));
    	 customerList.add(new Customer(3, "Vaishali", "Pune"));
    	 customerList.add(new Customer(4, "Prathama", "Delhi"));
    	 customerList.add(new Customer(5, "Prinkal", "Pune"));
    	 
         
    	 System.out.println("\nAll Customers:");
    	 productList.forEach(System.out::println);
    	 
    	 //From Pune
    	 
    	 System.out.println("\nCustomer from Pune :");
    	 for(Customer c: customerList) {
    		 if(c.getCity().equalsIgnoreCase("Pune"))
    			 System.out.println(c);
    	 }
    	 
    	 //Name starting with 'A'
    	 
    	 System.out.println("\nCustomers starting with 'A':");
    	 for(Customer c: customerList) {
    		 if(c.getName().startsWith("A"))
    			 System.out.println(c);
    	 }
    	 
    	 
    	 //count
    	 
    	 System.out.println("\nTotal Customers : " + customerList.size());
    	 
    	 //=============================ORDER OPERATION=======================
    	 
    	 List<Order> orderList = new ArrayList<>();
    	 Map<Integer,Order> orderMap = new HashMap<>();
    	 
    	 //create orders
    	 
    	 Order o1 = new Order(101, customerList.get(0),
    			 Arrays.asList(productList.get(0),productList.get(1)),0);
    			
    	 Order o2 = new Order(102, customerList.get(1),
    			 Arrays.asList(productList.get(2),productList.get(3)),0);
    	 
    	 Order o3 = new Order(103, customerList.get(2),
    			 Arrays.asList(productList.get(0),productList.get(2)),0);
           
           
    	 
    	//calculate total
    	 
    	 o1.setTotalAmount(calculateTotalAmount(o1.getProductList()));
    	 o2.setTotalAmount(calculateTotalAmount(o2.getProductList()));
    	 o3.setTotalAmount(calculateTotalAmount(o3.getProductList()));
    	 
    	 
    	 orderList.add(o1);
    	 orderList.add(o2);
    	 orderList.add(o3);
    	 
    	 orderMap.put(o1.getOrderId(), o1);
    	 orderMap.put(o1.getOrderId(), o2);
    	 orderMap.put(o1.getOrderId(), o3);
    	 
    	 
    	 //Display All orders
    	 
    	 System.out.println("\nAll Orders:");
    	 productList.forEach(System.out::println);
    	 
    	 //totalAmount > 500
    	 
    	 System.out.println("\nOrders with totalAmount > 500:");
    	 for(Order o: orderList) {
    		 if(o.getTotalAmount() > 500)
    			 System.out.println(o);
    	 }
    	 
    	 //orders by Rama
    	 System.out.println("\nOrders by Rama:");
    	 for(Order o: orderList) {
    		 if(o.getCustomer().getName().equalsIgnoreCase("Rama"));
    			 System.out.println(o);
    	 }
    	 
    	 
    	 //Total Revenue
    	 double totalRevenue = 0;
    	 for(Order o :orderList) {
    		   totalRevenue += o.getTotalAmount();
    	 }
    	 
    	 System.out.println("\n total Revenue: "+totalRevenue);
    	 
    	 }

	 private static double calculateTotalAmount(List<Product> productList) {
		// TODO Auto-generated method stub
		 double sum =0;
		 for(Product p: productList) {
			 sum += p.getPrice();
		 }
		return sum;
		
	 }
    	 
     }

