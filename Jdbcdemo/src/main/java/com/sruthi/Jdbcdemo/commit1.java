package com.sruthi.Jdbcdemo;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
import java.sql.SQLException;
public class commit1
{
    public static void main( String[] args ) 
    {
    	// Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con = null;
    	PreparedStatement pst = null;
    	PreparedStatement pst2 = null;
  
    	String url ="jdbc:mysql://localhost:3306/prolifics";
    	try
    	{
    	 con = DriverManager.getConnection(url,"root","Chitti@02");
    	 con.setAutoCommit(false);
    	 pst = con.prepareStatement("delete from employee");
       int count = pst.executeUpdate();
       con.commit();
       System.out.println(count+"rows deleted");
    	  pst2=con.prepareStatement("insert into department values(?,?,?)");
    	  pst2.setInt(1, 50);
     	 pst2.setString(2, "Finance");
     	 pst2.setString(3,"mumbai");
     	  count = pst.executeUpdate();
     	 System.out.println(count+"rows inseerted");
     	 con.rollback();
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