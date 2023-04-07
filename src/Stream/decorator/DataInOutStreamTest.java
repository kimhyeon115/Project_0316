package Stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 데이터 자료형을 그대로 읽고 쓰는 보조 스트림 사용
// 65라는 숫자를 입력하면 문자로 출력하여서 그 것을 숫자로 바꾸어서 출력했다
// 그 것을 숫자로 그대로 출력하게 하려는 것이다

public class DataInOutStreamTest {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos)){
			dos.write(100); // write의 사용을 참조해 보면 1byte, word 등 다양한 사용방법을 볼수 있다
							// 100을 사용하게 되면 1byte를 쓰는 경우가 된다
			dos.writeInt(10);
			dos.writeChar('A');
			dos.writeUTF("hello");
		}catch(IOException e) {
			System.out.println(e);
		}
		try(FileInputStream fis = new FileInputStream("data.txt");
				//파일로 출력한 것을 파일에서 읽어와서 화면으로 출력
				DataInputStream dis = new DataInputStream(fis)){
			System.out.println(dis.read());	//1byte로 읽은 것
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
