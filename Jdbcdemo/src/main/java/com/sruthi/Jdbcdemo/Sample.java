package com.sruthi.Jdbcdemo;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
public class Sample
{
    public static void main( String[] args ) 
    {
    	// Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con = null;
    	PreparedStatement pst = null;
    	ResultSet rs= null;
    	ResultSetMetaData rsmd =null;
    	String url ="jdbc:mysql://localhost:3306/prolifics";
    	try
    	{
    	 con = DriverManager.getConnection(url,"root","Chitti@02");
    	pst = con.prepareStatement("select * from employee");
    	rs = pst.executeQuery();
    	rsmd = rs.getMetaData();
    	int count = rsmd.getColumnCount();
    	for(int i=1;i<=count;i++)
    		System.out.print(rsmd.getColumnName(i)+"    ");
    	System.out.println();
    	while(rs.next())
    	{
    	  // System.out.println(rs.getString(1)+"   "+rs.getString(2)+"    "+rs.getString(3)+"     "+rs.getString(4));
    		// System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"    "+rs.getDouble(3)+"     "+rs.getInt(4));
    	
    	for(int i=1;i<=count;i++)
    	
    		System.out.print(rs.getString(i)+"      ");
    	    System.out.println();
    	}
    	}
    	catch(SQLException ex)
    	{
    		ex.printStackTrace();
    	}
    	finally
    	{
    		try
    		{
    			if(rs!=null) rs.close();
    			if(pst!=null) pst.close();
    			if(con!=null) con.close();
    		}
    		catch(SQLException ex)
    		{
    			ex.printStackTrace();
    		}
    	}
    }
}
/* 
	String url = "jdbc:mysql://localhost:3306/prolifics";
    	try(Connection con  = DriverManager.getConnection(url,"root","Chitti@02");
            PreparedStatement pst = con.prepareStatement("select * from employee");
                   ResultSet rs = pst.executeQuery())
    	{
    		while(rs.next())
    			   System.out.println(rs.getString(1)+"   "+rs.getString(2)+"    "+rs.getString(3)+"     "+rs.getString(4));
    	}
    	
    	catch(SQLException ex)
    	{
    		ex.printStackTrace();
    	}
    	
    	
    	
    	try
    	{
    	 con = DriverManager.getConnection(url,"root","Chitti@02");
    	// pst = con.prepareStatement("insert into employee values(104,'charan',30)");
    	pst = con.prepareStatement("select * from employee where empid=?");
    	pst.setInt(1, 102);
    	rs = pst.executeQuery();
    	if(rs.next())
    	   System.out.println(rs.getString(1)+"   "+rs.getString(2)+"    "+rs.getString(3)+"     "+rs.getString(4));
    	pst.setInt(1, 105);
    	rs = pst.executeQuery();
    	if(rs.next())
    	   System.out.println(rs.getString(1)+"   "+rs.getString(2)+"    "+rs.getString(3)+"     "+rs.getString(4));
    	}
    	
    	
    	// Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con = null;
    	PreparedStatement pst = null;
    	ResultSet rs= null;
    	String url ="jdbc:mysql://localhost:3306/prolifics";
    	try
    	{
    	 con = DriverManager.getConnection(url,"root","Chitti@02");
    	pst = con.prepareStatement("select * from employee");
    	rs = pst.executeQuery();
    	while(rs.next())
    	
    	   System.out.println(rs.getString(1)+"   "+rs.getString(2)+"    "+rs.getString(3)+"     "+rs.getString(4));
    		// System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"    "+rs.getDouble(3)+"     "+rs.getInt(4));
    	}
 
} */