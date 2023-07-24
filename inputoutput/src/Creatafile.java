import java.io.FileOutputStream;
import java.io.IOException;
public class Creatafile {

	public static void main(String[] args) {
	FileOutputStream fos= null;
	try
	{
		fos = new FileOutputStream("c:\\users\\Smolugu\\Desktop\\abc.txt",true);
		//fos = new FileOutputStream("c:\\users\\Smolugu\\Desktop\\abc.txt"); if we wont write true previous one will be deleted
		for(int i =97;i<=122;i++)
			fos.write(i);
		for(int i =65;i<=90;i++)
		fos.write(i);
		fos.close();
		
	}
	catch(IOException ex)
	{
		System.out.println(ex);
	}

	}

}
