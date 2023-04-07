package Stream.inputStream;

import java.io.IOException;

public class SystemIntest {

	public static void main(String[] args) {
		System.out.println("알파벳 하나를 쓰고 엔터를 누르세요");
		int i = 0;										//정수형 변수 설정
		try {					 //입력 문자 정수형변환 저장(코드값)
			i = System.in.read();//키보드 사용 입력			//오류 발생시
		}catch(IOException e) {							//오류를 참조변수에 넣어두고
			e.printStackTrace();						//오류 출력
		}
		System.out.println((char)i);					//정수형 코드값을 문자 형변환 하여 출력
		System.out.println(i);							//정수형 코드값이 출력됨
	}	

}
