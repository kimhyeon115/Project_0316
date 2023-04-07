package Stream.outputStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		String writetxt = "write.txt";
		try(FileWriter fw = new FileWriter(writetxt)){
			fw.write("A");
			char[] cbuf = {'B', 'C', 'D'};
			fw.write(cbuf);
			fw.write("안녕하세요");
			fw.write(cbuf,1,2);
			fw.write("123");
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
