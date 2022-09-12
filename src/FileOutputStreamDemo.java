import java.io.File;
import java.io.FileOutputStream;
public class FileOutputStreamDemo {
	public static void main(String[] args) {
		File file = null;
		FileOutputStream fileOutputStream = null;
		String data = "New line is added";
		try {
			file = new File("Hello.txt");
			fileOutputStream = new FileOutputStream(file);
			
			byte[] bs = data.getBytes();
			fileOutputStream.write(bs);
			fileOutputStream.close();
			System.out.println("File written successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}

