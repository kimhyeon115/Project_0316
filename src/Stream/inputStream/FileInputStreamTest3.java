package Stream.inputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input3.txt")) {
			byte[] bs = new byte[10];
			int i;
			while((i=fis.read(bs)) != -1) {
				for(byte b : bs) {				
					System.out.print((char)b);
				}
				System.out.println();
			}
		}catch(NullPointerException e) {			//catch문 다중 사용시 계층구조 영향받음
			System.out.println(e);					//하위 구조 부터 사용해야함
		}catch(IOException e) {						//상위 구조 먼저 사용시 전부 캐치해버리고 하위 구조 실행안함
			System.out.println(e);
		}
		System.out.println("end");
	}

}
// byte b : bs 는  bs 변수를 byte b 즉, byte 자료형 변수 b에다가 대입을 하여 
// 반복문을 수행 해주겠다는 뜻 입니다. 예를 들어 for (int a : b) 를 하게되면 b변수에 들어 있는 
// 값들을 int 자료형 변수 a 를 통해 출력을 하든지 새로운 값을 대입하여 정의하던지 반복을 수행해주겠다는 뜻입니다.

// ABCDEFGHIJ	new byte[10] 크기가 10짜리 버퍼
// KLMNOPQRST	연속 사용시 데이터 덮어씌움
// UVWXYZQRST	덮어씌운 데이터 짧을시 나머지 부분 이전 데이터 출력됨
// end
