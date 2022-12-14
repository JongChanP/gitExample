package ch04;

import java.util.Scanner;

public class Ecost {

	public static void main(String[] args) {
		//변수 선언
		String name="";//이름
		int price=0;//구매금액
		int point=0;//포인트
		int point_use=0;//포인트 사용금액
		int fee=0; //배송료
		int pay; //실제 결재금액
		
		//데이터 자료입력
		Scanner scan=new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.next();
		System.out.print("구매 금액 : ");
		price = scan.nextInt();
		System.out.print("보유포인트 : ");
		point = scan.nextInt();
		scan.close();
		
		//계산
		if(price < 20000) {
			fee = 2500;
		}
		if (price >=10000) {
			point_use = point;
			pay = price + fee - point;
		}else {
			pay = price + fee;
		}
		System.out.println("이름\t구매금액\t배송료\t포인트사용\t결제금액");
		System.out.println(name+"\t"+price+"\t"+fee+"\t"+point_use+"\t"+pay);
		
		System.out.printf("%s\t%d\t%d\t%d\t%d",name,price,fee,point_use,pay);
	}

}
