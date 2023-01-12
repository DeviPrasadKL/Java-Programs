package com.jspiders;

// Private --> id(Auto Generate), name, cost, quantity
// public constructor
// 4 public getters and 3 setter
// toString()
public class Product {
	private String id;
	private String name;
	private Double cost;
	private int quantity;
	
	private static int count = 1;
	
	public Product(String name, Double cost, int quantity) {
		this.id = "PRO"+ count++;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
		return "Id of Product is "+id+" \nName of the Product is "+name
				+" \nCost of the Product is "+cost+" \nQuantity of the Product is "+quantity;
	}
}
