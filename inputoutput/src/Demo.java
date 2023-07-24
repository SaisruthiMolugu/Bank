import java.io.File;
public class Demo {

	public static void main(String[] args) {
		File file = new File("c:\\Users\\Smolugu\\Desktop\\Calculator.java");
	System.out.println(file.getName());
	System.out.println(file.getParent());
	System.out.println(file.length());
	System.out.println("File   "+file.isFile());
	System.out.println("Directory   "+file.isDirectory());
	System.out.println("Executable  "+file.canExecute());
	
	}

}
