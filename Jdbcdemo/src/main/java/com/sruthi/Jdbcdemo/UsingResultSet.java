package com.sruthi.Jdbcdemo;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
import java.sql.SQLException;
public class UsingResultSet
{
    public static void main( String[] args ) 
    {
    	// Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con = null;
    	PreparedStatement pst = null;
    	ResultSet rs = null;
    String url ="jdbc:mysql://localhost:3306/prolifics";
    	try
    	{
    	 con = DriverManager.getConnection(url,"root","Chitti@02");
    	 pst=con.prepareCall("select deptno,depyname,location from department", ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
    	 rs=pst.executeQuery();
   /* 	 rs.moveToInsertRow();
    	 rs.updateInt(1,50);
    	 rs.updateString(2,"Finance");
    	 rs.updateString(3,"Mumbai");
    	rs.insertRow();
    	System.out.println("1 row is inserted");*/
    	
    	//delete specific row
          rs.absolute(3);
          rs.deleteRow();
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