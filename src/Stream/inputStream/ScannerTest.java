package Stream.inputStream;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하고 엔터를 누르세요");
		String name = scanner.nextLine();
		System.out.println("나이를 입력하고 엔터를 누르세요");
		int num = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(num);
	}

}
