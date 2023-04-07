package Stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		long milliseconds = 0;
		int len = 0;
		try(FileInputStream fis = new FileInputStream("test.txt");
				FileOutputStream fos = new FileOutputStream("Poutout.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)){	//버퍼의 기본 값 8Kbyte씩 읽음
			//파일을 복사하려고 한다.
			
			milliseconds = System.currentTimeMillis();
			int i;
			while((i=bis.read()) != -1) {
				bos.write(i);
				len++;
			}
			milliseconds = System.currentTimeMillis() - milliseconds;
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println(len);
		System.out.println(milliseconds);
	}

}
