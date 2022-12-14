package ch05;

import java.util.Scanner;

public class InputSum {

	public static void main(String[] args) {
		int[] num = new int[5];
		int sum =0;
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<num.length; i++) {
			System.out.print((i+1)+"번째 숫자를 입력하세요 : ");
			num[i] = scan.nextInt();
			//ex) num[0]=5, num[1]=3 . . . 
			sum = sum + num[i];
			
		}
		System.out.println("합계 : " + sum);
		scan.close();
	}

}
