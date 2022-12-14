package ch18;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileWrite {
	//프로그램 ==> 파일(출력스트림이 필요)
	public static void main(String[] args) {
		OutputStream os=null;
		try {
			os=new FileOutputStream("C:\\test\\aa.txt");
			System.out.println("입력하세요 : ");
			while (true) {
				int ch = System.in.read();
				if(ch==13) break;
				os.write(ch);
			}
			System.out.println("저장");
		} catch (Exception e) {
			System.out.println("저장 실패");
			e.printStackTrace();
		}
	}
}
