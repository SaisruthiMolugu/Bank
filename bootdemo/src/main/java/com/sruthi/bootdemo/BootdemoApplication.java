package com.sruthi.bootdemo;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sruthi.bootdemo.beans.Employee;
import com.sruthi.bootdemo.beans.Person;
import com.sruthi.bootdemo.entity.Book;
import com.sruthi.bootdemo.repository.BookRepository;

@SpringBootApplication  //it is a combination of @Configuration,@enableautoconfiuration,@Conponetscan in spring framework
public class BootdemoApplication 
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext container =SpringApplication.run(BootdemoApplication.class, args);
	
           BookRepository bookrepository = container.getBean(BookRepository.class);
           /* List<Book> books = bookrepository.findAll();
	    	for(Book b:books)
	     	{
	     		System.out.println(b.getBookid()+"   "+b.getBooktitle()+"   "+b.getBookauthor()+"    "+b.getCategory()+"   "+b.getPrice()+"   "+b.getCopies());
	     	
	     	}
	     	Book b= new Book("HFJ","Head First java","James","Java",900,9);
	     
	     	bookrepository.save(b);
	     	Optional<Book> b1 =bookrepository.findById("TCPP");
	     	if(b1.isPresent())
	     	{
	     		Book b2 = b1.get();
	     	
	     		System.out.println(b2 .getBookid()+"   "+b2.getBooktitle()+"   "+b2.getBookauthor()+"    "+b2.getCategory()+"   "+b2.getPrice()+"   "+b2.getCopies());
	     	}
	     	else
	     		System.out.println("book with id is not found");
	     	//bookrepository.deleteById("HFJ");
	     	System.out.println(bookrepository.count()); */
           
           List<Book> blist = bookrepository.findByCategory("Java");
           for(Book b:blist)
        	   System.out.println(b.getBookid()+"   "+b.getBooktitle()+"   "+b.getBookauthor()+"    "+b.getCategory()+"   "+b.getPrice()+"   "+b.getCopies());
           Optional<Book> b = bookrepository.findByBooktitle("Let Us C");
           if(b.isPresent())
           {
        	   Book b2 = b.get();
           
        	   System.out.println(b2.getBookid()+"   "+b2.getBooktitle()+"   "+b2.getBookauthor()+"    "+b2.getCategory()+"   "+b2.getPrice()+"   "+b2.getCopies());
	}
         /*  Optional<Book> b1 = bookrepository.findByprice(650);
           if(b1.isPresent())
           {
        	   Book b3 = b1.get();
           
        	   System.out.println(b3.getBookid()+"   "+b3.getBooktitle()+"   "+b3.getBookauthor()+"    "+b3.getCategory()+"    "+b3.getCopies()+"  "+b3.getPrice());
	         }*/
           List<Book> blist1 = bookrepository.findByprice(900);
           for(Book b1:blist1)
        	   System.out.println(b1.getBookid()+"   "+b1.getBooktitle()+"   "+b1.getBookauthor()+"    "+b1.getCategory()+"   "+b1.getPrice()+"   "+b1.getCopies());
           List<Book> blist2 = bookrepository.findBycopies(10);
           for(Book b3:blist2)
        	   System.out.println(b3.getBookid()+"   "+b3.getBooktitle()+"   "+b3.getBookauthor()+"    "+b3.getCategory()+"   "+b3.getPrice()+"   "+b3.getCopies());
	
	}

}
/*	Person p = container.getBean(Person.class);
System.out.println(p.getSsn()+"  "+p.getName()+"  "+p.getAge());
System.out.println(p.getAddress().getHno()+"   "+p.getAddress().getStreetname()+"  "+p.getAddress().getCity()+"  "+p.getAddress().getState());*/
/*Employee e = container.getBean(Employee.class);
System.out.println(e.getEmp_id()+"   "+e.getEmp_name()+"   "+e.getSalary());
System.out.println("Address details");
System.out.println(e.getAddress().getHno()+"    "+e.getAddress().getStreetname()+"   "+e.getAddress().getCity()+"   "+e.getAddress().getState());
System.out.println("Department details");
System.out.println(e.getDepartment().getDeptname()+"   "+e.getDepartment().getDeptno()+"    "+e.getDepartment().getLocation());*/
