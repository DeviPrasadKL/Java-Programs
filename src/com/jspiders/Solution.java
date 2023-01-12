package com.jspiders;

import java.util.Scanner;

import com.customException.InvalidChoiceException;

public class Solution {
	
	private static void displayMenu() {
		System.out.println("Enter the choice \n1) Add Product \n2) Remove Product \n3) Remove All Product"
				+ "\n4) Update Product \n5) Display Product \n6) Display All Products "
				+ "\n7) Count Products \n8) Sort Products \n9) Exit");
	}
	
	public static void main(String[] args) {
		// Menu-Driven Program --> 9 options
		// switch
		// com.customException --> InvalidChoiceException
		
		Scanner sc = new Scanner(System.in);
		DepartmentalStore store = new DepartmentalStoreImp();
		
		System.out.println(("Welcome to Departmental Store \n-------------------------------------------"));
		
		while(true) {
			displayMenu();
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: store.addProduct();
			break;
			case 2: store.removeProduct();
			break;
			case 3: store.removeAllProduct();
			break;
			case 4: store.updateProduct();
			break;
			case 5: store.displayProduct();
			break;
			case 6: store.displayAllProduct();
			break;
			case 7: store.countProduct();
			break;
			case 8: store.sortProduct();
			break;
			case 9:
				System.out.println("Thank You!");
				System.exit(0);
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
		
	}
}


















