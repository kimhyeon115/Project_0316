package Stream.inputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		int i = 0;
		try {
			fis = new FileInputStream("input.txt");
			//input.txt > 프로젝트에서 우클릭 > new > file > 내용입력 > 저장
			while((i=fis.read()) != -1) {			//-1은 데이터의 마지막을 뜻함(마지막일때 까지 반복)
				System.out.print((char)i);
			}				
		}catch(IOException e) {
			System.out.println(e);
		}catch(NullPointerException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}
}
