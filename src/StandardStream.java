import java.io.*; 

public class StandardStream {
	public static void main(String args[]) throws IOException 
	{ 

            InputStreamReader inp = null;
            inp = new InputStreamReader(System.in);
            System.out.println("Enter characters, "+ " and '0' to quit.");
            char c; 
		do { 
			c = (char)inp.read(); 
			System.out.print(c); 
		} while (c != '0'); 
                
            System.err.println("Error");
	} 
} 

