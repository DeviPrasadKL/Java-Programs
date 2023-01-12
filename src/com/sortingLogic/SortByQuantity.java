package com.sortingLogic;

import java.util.Comparator;

import com.jspiders.Product;

public class SortByQuantity implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getQuantity()-o2.getQuantity();
	}

}
