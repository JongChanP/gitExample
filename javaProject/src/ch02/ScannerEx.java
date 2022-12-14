package ch02;

import java.util.Scanner;
//java.lang 패키지는 기본패키지로서 import를 안해도 되지만 그 외의 패키지는 import라는 것을 해야한다.

//키보드로부터의 사용자 입력 프로그램
public class ScannerEx {

	public static void main(String[] args) {
		//Ctrl + Shift + O : 자동 import를 해주는 hot key
		Scanner in = new Scanner(System.in);
		System.out.println("첫번째 정수값을 입력하세요"); //반드시 안내문구가 먼저 나오게 한다.
		int x = in.nextInt();//정수값을 키도르로부터 받아 처리하는 메소드
		System.out.println("두번째 정수값을 입력하세요");
		int y = in.nextInt();
		System.out.printf("%d * %d은 %d입니다.\n" , x, y, x*y);
		in.close();

	}

}
