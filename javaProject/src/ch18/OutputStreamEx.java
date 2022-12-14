package ch18;

import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os = ps;//PrintStream 객체를 부모타입인 OutputStream으로 받아 처리
		//OutputStream도 1byte 처리 스트림(한글 x)
		try {
			os.write(97);//97은 키보드 코드값 a
			os.write(98);//98은 키보드 코드값 b
			os.write(99);//99은 키보드 코드값 c
			os.flush();//flush()메소드를 사용해야 출력까지 된다.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
