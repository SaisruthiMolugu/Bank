
public class Checked {

	public static void divide(int x,int y) throws  java.sql.SQLException
	 {
		// TODO Auto-generated meth
		if(y!=0)
			System.out.println( x/y);
		else
		{
				throw new java.sql.SQLException();
		}
	}

}
