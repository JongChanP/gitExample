package ch18;

import java.io.IOException;

public class InputStreamEx2 {
	public static void main(String[] args) {
		int var = 0;//입력받는 문자를 숫자로 받아서 처리하기 위한 변수
		System.out.print("내용을 입력하세요 : ");
		try {
			var = System.in.read();
			while(var != 13) {//13의 키보드 코드값은 엔터키
				System.out.println(var+"==>"+(char)var);
				var = System.in.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
