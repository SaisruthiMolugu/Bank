package com.sruthi.bootdemo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sruthi.bootdemo.entity.Book;

public interface BookRepository extends JpaRepository<Book,String>
{
	Optional<Book> findByBooktitle(String Booktitle);

    List<Book> findByCategory(String category);
    
    //Optional<Book> findByprice(double price);
    List<Book> findByprice(double price);
    List<Book> findBycopies(int copies);
}
  