package com.capg.msc.myshoppingcart.service;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.capg.msc.myshoppingcart.beans.Product;
import com.capg.msc.myshoppingcart.dao.*;

@Service
public class ProductServiceImp implements ProductService {
	
	
	@Autowired
	private ProductRepository repo;
	@Override
	public List<Product> getAllProducts() {
		return repo.findAll();
	}

	@Override
	@Transactional
	public Product SaveProduct(Product p) {
		
		repo.save(p);
		return p;
	}

	@Override
	public void deleteProductById(int id) {
		repo.deleteById(id);
		
		
	}

	@Override
	public void updateProductById(Product p, int id) {
		
		repo.save(p);
	}

	@Override
	public Product getProductById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Product> getAllProductsByCategory(String category) {
		return repo.getProductByCategory(category);
	}

	@Override
	public List<Product> getAllProductsByCategoryAndPrice(String category, int range1, int range2) {
		return repo.getProductByCategoryAndPrice(category, range1, range2);
	}

	@Override
	public boolean findCategory(String category) {
		 if(repo.getProductByCategory(category).equals(null))
			 return false;
		return true;
	}

	@Override
	public List<Product> getAllProductsByProductName(String productName) {
		
		return repo.getProductByProductName(productName);
	}

	@Override
	public boolean findProductName(String productName) {
		if(repo.getProductByProductName(productName).equals(null))
			return false;
		return true;
	}

	
	

	
	

	
	
	
	
}