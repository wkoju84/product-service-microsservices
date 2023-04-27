package com.productmicrosservives.productservice.repository;

import com.productmicrosservives.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository <Product, String> {
}
