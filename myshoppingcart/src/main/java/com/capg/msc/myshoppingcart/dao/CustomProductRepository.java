package com.capg.msc.myshoppingcart.dao;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import com.capg.msc.myshoppingcart.beans.Product;

public interface CustomProductRepository {
	public List<Product> getProductByCategory(String proudctCategory);
	public List<Product> getProductByCategoryAndPrice(String proudctCategory,int range1,int range2);
	public List<Product> getProductByProductName(String productName);
}
