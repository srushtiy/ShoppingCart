package edu.niit.shoppingcart.product;

public class Product {
	private String id;
	private String name;
	private double price;
	public Product(String id, String name){
		this.id = id;
		this.name = name;
	}
	public Product (String id, String name, double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price<= 0){
			System.out.println("Invalid price");
			this.price = 500.00;
		}
		else
			this.price = price;
	}
	
	
}
