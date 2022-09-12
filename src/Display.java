import java.io.File;
public class Display
{
	public static void main(String[] args) 
	{ 
		File directory = new File("C:\\Users\\Maimoona Khilji\\Documents"); 
		String[] list = directory.list(); 
		for (int i = 0; i < list.length; i++)
		 { 
			System.out.println ( (i + 1) + " : " + list [ i ] ) ; 
		 }
	 }
}
