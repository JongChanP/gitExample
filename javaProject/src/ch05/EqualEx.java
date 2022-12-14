package ch05;

import java.util.Scanner;

public class EqualEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("문자열을 입력해주세요 : ");
			String str = sc.nextLine();//문자열을 입력받게 하는 함수중 하나
			if(str.equals("exit")) {//문자형참조변수.equals("비교할 문자")
				//참고 : 값을 비교할때는 "a==b"
				break;
			}else {
				System.out.println(str.length()+"글자 입니다.");
				//length() : 문자열에 대한 글자 수 반환하는 메소드(배열의 길이값)
			}
		}
		System.out.println("프로그램을 종료 합니다.");
	}

}
