package com.sruthi.rest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sruthi.rest.entity.Product;

public interface ProductRepository extends JpaRepository<Product,String> 
{

}
