package com.capg.msc.myshoppingcart.service;

import java.util.List;
import com.capg.msc.myshoppingcart.exception.InvalidCostRangeException;
import org.springframework.data.jpa.repository.Query;

import com.capg.msc.myshoppingcart.beans.Product;

public interface ProductService {
	
	public List<Product>  getAllProducts();
	
	public Product SaveProduct(Product p);
	
	public void  deleteProductById(int id);
	
	public void  updateProductById(Product p,int id);
	
	public Product getProductById(int id);
	
    public List<Product> getAllProductsByCategory(String category);
	
	public List<Product> getAllProductsByCategoryAndPrice(String category,int range1,int range2);
	
	public boolean findCategory(String category);
	
	public List<Product> getAllProductsByProductName(String productName);
	
	public boolean findProductName(String productName);

}