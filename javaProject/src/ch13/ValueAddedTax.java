package ch13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValueAddedTax {
	public static double valueofsupply;//공급가액
	public static int vatRate = 10; //부가세율
	public static double getVat() {//부가계산
		return valueofsupply / vatRate;
	}
	public static double getTotal() {//부가세포함합계
		return valueofsupply / vatRate;
	}
	public static void main(String[] args) {
		DecimalFormat decFormat = new DecimalFormat("###,###");
		Scanner sc = new Scanner(System.in);
		System.out.println("공급가액을 입력하세요 : ");
		ValueAddedTax.valueofsupply = Integer.parseInt(sc.nextLine());
		System.out.println("*************************************");
		System.out.println("공급가액 : " + decFormat.format((int)valueofsupply)+"원");
		System.out.println("부가가치세율 : " +vatRate + "%");
		System.out.println("부가가치세 : " +decFormat.format((int)getVat())+"원");
		System.out.println("합계 :"+decFormat.format((int)getTotal())+"원");
		sc.close();
	}
}
