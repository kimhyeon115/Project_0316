package Stream.outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileQutputStreamTest2 {

	public static void main(String[] args) {
		byte[] bs = new byte[26];
		byte data = 65;
		final int j = bs.length;	//안정성 효율성 좋음
		for(int i=0; i<j; i++) {	//버퍼에 저장
			bs[i] =	data++;
		}											 //("output.txt", true) 기존 데이터에 추가
		try(FileOutputStream fos = new FileOutputStream("output.txt")){	  //기존 데이터 삭제후 추가
			fos.write(bs,2,10);						 //bs변수의 문자열에서 index 2번 부터 10번까지
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}