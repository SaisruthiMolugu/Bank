package com.sruthi.Jdbcdemo;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
import java.sql.SQLException;
public class readable
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
    	 pst=con.prepareCall("select * from department", ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    	 rs=pst.executeQuery();
    	 while(rs.next())
    		 System.out.println(rs.getString(1)+"          "+rs.getString(2)+"        "+rs.getString(3));
    	 System.out.println("------------------------------");
    	 while(rs.previous())
    		 System.out.println(rs.getString(1)+"          "+rs.getString(2)+"        "+rs.getString(3));
;    	
      
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