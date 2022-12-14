package ch04;

import java.util.Scanner;

public class Do_While_Random {

	public static void main(String[] args) {
		int input = 0;
		int answer =0;
		answer = (int)(Math.random()*10)+1;//1부터 10사이의 임의의 수 를 발생
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("1과 10사이의 정수를 입력하세요 : ");
			String tmp = sc.next();//사용자가 문자형으로 자료를 입력
			input = Integer.parseInt(tmp);//Integer.parseInt() >> 문자형을 숫자형으로 변환
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			}else if(input < answer) {
				System.out.println("더 큰수로 다시 시도해 보세요.");
			}
		}while(input != answer);
		sc.close();
		System.out.println("정답입니다.");
	}

}
