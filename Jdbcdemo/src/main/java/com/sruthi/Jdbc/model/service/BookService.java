package com.sruthi.Jdbc.model.service;

import java.util.Scanner;

import com.sruthi.Jdbc.model.bean.Book;
import com.sruthi.Jdbc.model.dao.BookDAO;
public class BookService 
{
   private Scanner sc =new Scanner(System.in);
   private BookDAO bdao = new BookDAO();
   public String addBook()
   {
	   System.out.println("Enter book id");
	   String bookId = sc.nextLine();
	   System.out.println("Enter book title");
	   String bookTitle = sc.nextLine();
	   System.out.println("Enter Book Author");
	   String bookAuthor =sc.nextLine();
	   System.out.println("Enter Book Category");
	   String bookCategory= sc.nextLine();
	   System.out.println("Enter BookPrice");
	   double bookPrice = sc.nextDouble();
	   System.out.println("Enter book Copies");
	   int copies = sc.nextInt();
	   if(bdao.insertBook(new Book(bookId,bookTitle,bookAuthor,bookCategory,bookPrice,copies)))
		   return "Book Details Added";
	   return "Book Addition Failed";
	   }
   public void showAllBooks()
   {
	   for(Book b : bdao.getAllBooks())
		   System.out.println(b.getBookId()+ " "+b.getBookTitle()+" "+b.getBookAuthor()+"  "+b.getBookCategory()+" "+b.getBookPrice()+" "+b.getCopies());
		   
   }
   public void showBookByCategory()
   {
	   System.out.println("Enter book category");
	   String category = sc.nextLine();
	   for(Book b : bdao.getBookByCategory(category))
	   System.out.println(b.getBookId()+ " "+b.getBookTitle()+" "+b.getBookAuthor()+"  "+b.getBookCategory()+" "+b.getBookPrice()+" "+b.getCopies());
   }
  public void showBookByTitle()
  {
	  System.out.println("enter book title");
	  String bookTitle=sc.nextLine();
	  Book b = bdao.getBookByTitle(bookTitle);
	  if(b!=null)
		  System.out.println(b.getBookId()+ " "+b.getBookTitle()+" "+b.getBookAuthor()+"  "+b.getBookCategory()+" "+b.getBookPrice()+" "+b.getCopies());
	  else
		  System.out.println("Book Does not exist  by title"+bookTitle);
  }
  public void deleteBookByTitle()
  {
	  System.out.println("Enter book title");
      String bookTitle = sc.nextLine();
      if(bdao.deleteBookByTitle(bookTitle))
          System.out.println(bookTitle + "Deleted Successfully");
      else
          System.out.println("Book does not exist by title"+bookTitle);

  
  }
}
