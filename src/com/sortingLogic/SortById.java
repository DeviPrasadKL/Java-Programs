package com.sortingLogic;

import java.util.Comparator;

import com.jspiders.Product;

public class SortById implements Comparator<Product>{

	@Override
	public int compare(Product x, Product y) {
		return x.getId().compareTo(y.getId());
	}

}
