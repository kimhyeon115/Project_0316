package Stream.outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileQutputStreamTest {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			fos.write(65);		//문자로 출력됨
			fos.write(66);
			fos.write(67);
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
