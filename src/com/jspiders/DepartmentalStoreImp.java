package com.jspiders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.customException.InvalidChoiceException;
import com.customException.ProductNotFoundException;
import com.sortingLogic.SortByCost;
import com.sortingLogic.SortById;
import com.sortingLogic.SortByName;
import com.sortingLogic.SortByQuantity;

public class DepartmentalStoreImp implements DepartmentalStore{
	Scanner sc = new Scanner(System.in);
	Map<String, Product> db = new LinkedHashMap<String, Product>();

	@Override
	public void addProduct() {
		// Accept user input name, cost, quantity
		// Create an instance of Product
		// Add into db --> put() --> Entry
		System.out.println("Add Name");
		String name = sc.next();
		System.out.println("Add Cost (Double)");
		Double cost = sc.nextDouble();
		System.out.println("Add Quantity");
		int quantity = sc.nextInt();

		Product product = new Product(name, cost, quantity);
		db.put(product.getId(), product);

		System.out.println("Product Added Sucessfully");

	}

	@Override
	public void removeProduct() {
		System.out.println("Enter the Product Id");
		String id = sc.next().toUpperCase();

		if(db.containsKey(id)) {
			Product p = db.remove(id);
			System.out.println("Product Removed Sucessfully!!!!!");
			System.out.println();
		}else {
			try {
				throw new ProductNotFoundException("Product Not Found");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void removeAllProduct() {
		if(db.size()>0) {
			db.clear();
			System.out.println("All Products are removed!!!!!!!!");
		}else {
			System.out.println("No Products to remove");
		}
	}

	@Override
	public void updateProduct() {
		System.out.println("Enter the Product Id to Update");
		String id = sc.next().toUpperCase();

		if(db.containsKey(id)) {
			Product product = db.get(id);

			System.out.println("1) Update Name \n2) Update Cost \n3) Update Quantity");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the New Name");
				product.setName(sc.next());
				System.out.println("Name Updated");
				break;
			}
			case 2:{
				System.out.println("Enter the New Cost");
				product.setCost(sc.nextDouble());
				System.out.println("Cost Updated");
				break;
			}
			case 3:{
				System.out.println("Enter the New Quantity");
				product.setQuantity(sc.nextInt());
				System.out.println("Quantity Updated");
				break;
			}
			default:
				try {
					throw new InvalidChoiceException("Invalid Choice");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
					System.out.println();
				}
			}

		}else {
			try {
				throw new ProductNotFoundException("Product Not Found");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void displayProduct() {
		// Accept product id
		// Check if id is there or not --> containsKey()
		// Invoke an Exception --> ProductNotFoundException

		System.out.println("Enter the Product Id");
		String id = sc.next().toUpperCase();

		if(db.containsKey(id)) {
			Product p = db.get(id);
			System.out.println(p);
			System.out.println();
		}else {
			try {
				throw new ProductNotFoundException("Product Not Found");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void displayAllProduct() {
		// Map into keySet
		// get()
		System.out.println("<-------Product List------>");

		Set<String> keys = db.keySet();
		for(String id : keys) {
			System.out.println(db.get(id));
			System.out.println("--------------------------------");
		}
	}

	@Override
	public void countProduct() {
		System.out.println("Total number Products are-->"+db.size());
	}

	@Override
	public void sortProduct() {
		//Converting to KeySet
		Set<String> keys = db.keySet();

		//Creating Array, to store set of keys into ArrayList
		List<Product> list =  new ArrayList<Product>();

		for(String key : keys) {
			list.add(db.get(key));
		}

		System.out.println("1) Sort By ID \n2) Sort By Name \n3) Sort By Cost \n4) Sort By Quantity");
		int choice = sc.nextInt();

		switch (choice) {
		case 1: {
			Collections.sort(list, new SortById());
			AscAndDesc(list); 
			break;
		}
		case 2:{
			Collections.sort(list, new SortByName());
			AscAndDesc(list);
			break;
		}
		case 3:{
			Collections.sort(list, new SortByCost());
			AscAndDesc(list);
			break;
		}
		case 4:{
			Collections.sort(list, new SortByQuantity());
			AscAndDesc(list);
			break;
		}
		default:
			try {
				throw new InvalidChoiceException("Invalid Choice");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println();
			}
		}
	}

	private void display(List<Product> list) {
		for(Product p : list) {
			System.out.println(p);
			System.out.println("------------------------------------");
		}
	}
	
	/**
	 * This Method Sort by Asc or Desc and then Display the list
	 */
	private void AscAndDesc(List<Product> list) {
		System.out.println("1)Ascending Order \n2)Descending Order");
		int choice = sc.nextInt();
		if(choice==1) {
			display(list);
		}else {
			Collections.reverse(list);
			display(list);
		}
	}


}



















