import java.io.*; 
public class Directory { 

	public static void main(String args[]) 
	{ 
		File f = new File("src"); 
		if (f.mkdir()) { 
			System.out.println("Directory is created"); 
		} 
		else { 
			System.out.println("Directory cannot be created"); 
		} 
	} 
} 
