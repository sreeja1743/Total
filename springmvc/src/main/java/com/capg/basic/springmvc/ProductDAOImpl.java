package com.capg.basic.springmvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

// Manage Database

@Component
public class ProductDAOImpl {

	LinkedList<Product> list = new LinkedList<>();

	public ProductDAOImpl() {
		
		Product p1 = new Product(101, "HP-101",45000,5);
		Product p2 = new Product(102, "HP-102",15000,4);
		Product p3 = new Product(103, "HP-103",25000,1);
		Product p4 = new Product(104, "HP-104",20000,0);
		Product p5 = new Product(105, "HP-105",145000,3);
		Product p6 = new Product(106, "HP-106", 150000, 2);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
	}
	
	public LinkedList<Product> getAllProducts()
	{
		return list;
	}
	
	public List<Product> getProductsByRange(int r1,int r2)
	{
		
		Comparator<Product> comp = (p1,p2)->p1.getProductCost() - p2.getProductCost();
		
	    List<Product> productList = list.stream().
		filter((product)->product.getProductCost()>=r1&&product.getProductCost()<=r2).
		collect(Collectors.toList());
		
		return productList;
	}
	
	public Product getProductById(int searchid)
	{
		boolean isIdFound = false;
		Product searchedProduct = null;
		for (Product product : list) {
			if(product.getProductId() == searchid)
			{
				isIdFound = true;
				searchedProduct = product;
				break;
			}
		}
		return searchedProduct;
	}
	
	public boolean deleteProductById(int id){
		boolean isDeleted = false;
		
	   isDeleted = list.remove(getProductById(id));
	    
	   
		return isDeleted;
	}
	
	public void updateProduct(Product product) {
		Product previous = getProductById(product.getProductId());
		previous.setProductCost(product.getProductCost());
		previous.setProductName(product.getProductName());
		previous.setStarRating(product.getStarRating());
	}
	
	
	public boolean insertProduct(Product product) {
		return list.add(product);
	}
	
	
	
}//end class
