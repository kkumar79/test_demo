package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Product;
import com.app.repo.ProductRepo;

@RestController
public class ProductController {
	
	@Autowired
	ProductRepo repo;
	
	@PostMapping("/save")
  public ResponseEntity<String> save(@RequestBody Product p){
		
		repo.save(p);
	  
	  return new ResponseEntity<String>("Data Inserted",HttpStatus.OK);
	  
  }
}
 