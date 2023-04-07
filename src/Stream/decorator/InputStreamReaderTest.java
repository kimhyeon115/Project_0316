package Stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		String reader = "reader.txt";
//		try(FileInputStream fis = new FileInputStream(reader)){//byte단위로 읽기 때문에 한글(2byte) 깨짐
		try(InputStreamReader irs = new InputStreamReader(new FileInputStream(reader))){
			int i = 0;									//byte단위로 읽은걸 다시 재정의 해서 보완(보조스트림)				
			while((i=irs.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
// e.getMessage() : 에러의 원인을 간단하게 출력
// e.toString() : 에러의 Exception 내용과 원인을 출력
// e.printStackTrace() : 에러의 발생근원지를 찾아서 단계별로 에러를 출력
// System.out.println(e); 위와 같다고 봐도 무방