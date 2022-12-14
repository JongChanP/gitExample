package ch06;

import java.util.Scanner;

public class HolidayEx {
	static int y;//전역,필드,멤버변수(클래스 전체에서 사용할 수 있는 변수)
	
	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("근속 년수를 입력하세요 : ");
		y=sc.nextInt();
		sc.close();
	}
	static int holiday(int year) {
		int day=0;//day는 지역, 로컬변수 해당 메소드 내에서만 사용가능
		if(year <=5) {//근속년수 1~5년
			day=10;
		}else if(year <=10) {//근속년수 6~10년
			day=15;
		}else{//근속년수 11년 이상
			day=20;
		}
		return day;
	}
	public static void main(String[] args) {
		input();
		System.out.println("휴가 일수 :" +holiday(y));
	}
}
