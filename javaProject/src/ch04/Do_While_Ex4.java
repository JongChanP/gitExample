package ch04;

import java.util.Scanner;

public class Do_While_Ex4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month;
		do {
			System.out.print("올바른 월을 입력하세요 [1~12] : ");
			month = in.nextInt();
		}while(month < 1 || month > 12);
		in.close();
		System.out.println("사용자가 입력한 월은 " + month);
	}

}
