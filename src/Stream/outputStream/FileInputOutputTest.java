package Stream.outputStream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputOutputTest {

	public static void main(String[] args) {
		FileReader fis = null;
		int i=0;
		String gd = "write.txt";
		try {
			fis = new FileReader(gd);
			while((i=fis.read()) != -1) {
				System.out.print((char)i);
			}
			System.out.println();
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();					// cmd창에서는 필수적임
			}catch(IOException e) {
				System.out.println(e);
			}catch(NullPointerException e) {
			System.out.println(e);
			}
		}
		System.out.println("end");
	}
}
