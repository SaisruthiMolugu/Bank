package com.sruthi.bootdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book
{
   @Id
   @Column(name = "book_id")
   private String bookid;
   @Column(name ="book_title")
   private String booktitle;
   @Column(name ="book_author")
   private String bookauthor;
   @Column(name="book_category")
   private String category;
   @Column(name="book_price")
   private double price;
   private int copies;
public Book() {}
public Book(String bookid, String booktitle, String bookauthor, String category, double price, int copies)
{
	this.bookid = bookid;
	this.booktitle = booktitle;
	this.bookauthor = bookauthor;
	this.category = category;
	this.price = price;
	this.copies = copies;
}
public String getBookid() 
{
	return bookid;
}
public void setBookid(String bookid)
{
	this.bookid = bookid;
}
public String getBooktitle()
{
	return booktitle;
}
public void setBooktitle(String booktitle)
{
	this.booktitle = booktitle;
}
public String getBookauthor() {
	return bookauthor;
}
public void setBookauthor(String bookauthor) 
{
	this.bookauthor = bookauthor;
}
public String getCategory() 
{
	return category;
}
public void setCategory(String category) 
{
	this.category = category;
}
public double getPrice() 
{
	return price;
}
public void setPrice(double price)
{
	this.price = price;
}
public int getCopies() {
	return copies;
}
public void setCopies(int copies)
{
	this.copies = copies;
}
   
}
