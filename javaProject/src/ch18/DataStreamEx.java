package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamEx {ㅛㄴ
	public static void main(String[] args) {
		try {
			//텍스트파일이 아닌 binary file(이전파일)로 저장
			DataOutputStream dataout = new DataOutputStream
					(new FileOutputStream("c:\\test\\test.dat"));
			dataout.writeInt(123);//숫자형식의 자료를 파일에 저장
			dataout.writeChar('A');//문자형식의 자료를 파일에 저장
			dataout.writeDouble(3.5);//실수저장
			dataout.close();//스트림 닫기 (파일완성)
			System.out.println("파일저장");
			DataInputStream datain=new DataInputStream(new FileInputStream("c:\\test\\test.dat"));
			System.out.println();
			System.out.println();
			System.out.println();
		} catch (Exception e) {
			
		}
	}
}
