package com.sruthi.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sruthi.rest.entity.Product;
import com.sruthi.rest.service.ProductService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RequestMapping("/product")
@RestController
public class ProductController
{
   @Autowired
   ProductService productService;
   @GetMapping(value="/",produces="application/json")
   public List<Product> getAllTProducts()
   {
       return productService.getAllProducts();
   }
   @GetMapping(value="/{productId}",produces="application/json")
   public ResponseEntity<Product> getProductByProductId(@PathVariable String productId)
   {
       Product p = productService.getProductById(productId);
       if(p!=null)
           return new ResponseEntity<Product>(p,HttpStatus.OK);
       return new ResponseEntity<Product>(p,HttpStatus.NOT_FOUND);
    }
}

