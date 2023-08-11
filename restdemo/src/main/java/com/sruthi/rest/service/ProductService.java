package com.sruthi.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sruthi.rest.Repository.ProductRepository;
import com.sruthi.rest.entity.Product;

@Service
public class ProductService
{
  @Autowired
  ProductRepository productRepository;
  public List<Product> getAllProducts()
  {
	  return productRepository.findAll();
  }
  public Product getProductById(String ProductId)
  {
	  Optional<Product> p = productRepository.findById(ProductId);
      if(p.isPresent())
    	  return p.get();
      return null;
      
   }
  
}
