import java.io.File;  
import java.io.FileInputStream;
import java.io.IOException;
  
class FileInputStreamDemo {  
  public static void main(String args[]) {  
    int size;  
  
    // Use try-with-resources to close the stream. 
    try ( FileInputStream f = new FileInputStream("Hello.txt") ) 
    { 
        System.out.println("Total Available Bytes: " + (size = f.available()));   
        for (int i=0; i < size; i++) 
        {  
            System.out.print((char) f.read());  
        }  
        f.close();
    } 
    catch(IOException e) 
    {  
      System.out.println("I/O Error: " + e);  
    }  
  }  
}
