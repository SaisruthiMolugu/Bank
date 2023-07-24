import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class Bufferreader {

	public static void main(String[] args) {
	
	//	FileOutputStream fos = null;
	//BufferedOutputStream bos = null;
		try(FileWriter fos = new FileWriter("c:\\users\\SMolugu\\Desktop\\Streams\\abc.text");
				BufferedWriter bos = new BufferedWriter(fos,500))
		{
		//fos = new FileOutputStream("c:\\users\\SMolugu\\Desktop\\Streams\\abc.text");
		// bos = new BufferedOutputStream(fos,500);
		for(int i = 65;i<=122;i++)
			bos.write(i);
		//bos.close();
		//fos.close();
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		

	}

}
