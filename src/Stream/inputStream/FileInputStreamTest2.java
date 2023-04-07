package Stream.inputStream;

import java.io.FileReader;
import java.io.IOException;
//FileReader는 UTF-8 (3byte) 타입으로 인코딩
public class FileInputStreamTest2 {

	public static void main(String[] args) {
		FileReader fis = null;
		int i = 0;
		try {
			fis = new FileReader("input2.txt");
			while((i=fis.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				System.out.println(e);
			}catch(NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}

}
