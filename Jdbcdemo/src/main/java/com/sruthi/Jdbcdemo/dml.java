package com.sruthi.Jdbcdemo;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
import java.sql.SQLException;
public class dml 
{
    public static void main( String[] args ) 
    {
    	// Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con = null;
    	PreparedStatement pst = null;
  
    	String url ="jdbc:mysql://localhost:3306/prolifics";
    	try
    	{
    	 con = DriverManager.getConnection(url,"root","Chitti@02");
    	 con.setAutoCommit(false);
    	 pst = con.prepareStatement("delete from employee");
       int count = pst.executeUpdate();
       System.out.println(count+"rows deleted");
    	  
  
    	 }
    	catch(SQLException ex)
    	{
    		ex.printStackTrace();
    	}
    	finally
    	{
    		try
    		{
    		
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

/*Connection con = null;
    	PreparedStatement pst = null;
  
    	String url ="jdbc:mysql://localhost:3306/prolifics";
    	try
    	{
    	 con = DriverManager.getConnection(url,"root","Chitti@02");
    	 pst = con.prepareStatement("insert into employee values(?,?,?,?)");
  
    	 pst.setInt(1, 104);
    	 pst.setString(2, "charan");
    	 pst.setDouble(3,400000.34);
    	 pst.setInt(4, 40);
    	 int count = pst.executeUpdate();
    	 System.out.println(count+ "Rows Inserted");
    	 
    	 pst.setInt(1, 108);
    	 pst.setString(2, "cherry");
    	 pst.setDouble(3,50000.34);
    	 pst.setInt(4, 30);
    	  count = pst.executeUpdate();
    	 System.out.println(count+ "Rows Inserted");
    
  
    	 }*/
