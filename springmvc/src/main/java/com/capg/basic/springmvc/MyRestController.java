package com.capg.basic.springmvc;

import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class MyRestController {
    
	@Autowired
	ProductDAOImpl dao;
	
	@GetMapping("/hello")
	public String setUP() {
		return "Hello";
	}
	
	@GetMapping("/product/{r1}/{r2}")
	public List<Product> getProductsbyrange(@PathVariable int r1 ,@PathVariable int r2)
	{
		return dao.getProductsByRange(r1, r2);
	}
	
	@GetMapping("/product/{searchid}")
	public Product getProductByid(@PathVariable int searchid)
	{
		return dao.getProductById(searchid);
	}
	
	@GetMapping("/delete/{id}")
	public boolean  deleteProductBasedOnId(@PathVariable int id){
	   return dao.deleteProductById(id);
	}
	
	
	@PostMapping("/product")
	public Product InsertProduct(@RequestBody Product product) {
		if(dao.insertProduct(product))
			return product;
		return null;
	}
	
	@PutMapping("/product")
	public Product updateProduct(@RequestBody Product product) {
		dao.updateProduct(product);
		return product;
	}
	
}
