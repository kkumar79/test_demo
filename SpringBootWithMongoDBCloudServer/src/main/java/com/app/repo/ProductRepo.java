package com.app.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.model.Product;

public interface ProductRepo  extends MongoRepository<Product,String>{

}
