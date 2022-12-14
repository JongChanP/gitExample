package ch04;

import java.util.Scanner;

public class ControlEx {

	public static void main(String[] args) {
		int menu=0,num=0;
		Scanner scan = new Scanner(System.in);
		
		outer ://라벨처리
		while(true) {
			System.out.println("(1) square(제곱)");
			System.out.println("(2) square root(제곱근)");
			System.out.println("(3) log(로그)");
			System.out.print("원하는 메뉴(1~3)을 선택하세요.(종료 : 0) >");
			String tmp = scan.next();
			menu = Integer.parseInt(tmp);//문자열을 숫자열로 변환
			if(menu == 0 ) {
				System.out.println("프로그램을 종료합니다.");
				break;	
			}else if(menu < 1 | menu > 3) {
				System.out.println("잘못 선택하셨습니다(종료:0)");
				continue;
			}
			for(;;) {//for(;;)는 무한반복 가능
				System.out.println("계산할 값을 입력하세요. (계산 종료:0, 전체종료:99)");
				tmp = scan.next();
				num = Integer.parseInt(tmp);
				if(num==0) break;//계산 종료 for 문만 벗어남
				if(num==99) break outer;//전체 종료 for문과 while문 모두 벗어남
				switch(menu) {
				case 1:
					System.out.println("result = " +num*num);//제곱
					break;
				case 2:
					System.out.println("result = " +Math.sqrt(num));//제곱근
					break;
				case 3:
					System.out.println("result = " +Math.log(num));//로그
					break;
				}//switch~case
			}//end for(;;)
		}//end while
		System.out.println("프로그램을 모두 종료 합니다.");
	}//end main
}