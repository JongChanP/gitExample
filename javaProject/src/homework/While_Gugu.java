package homework;

import java.util.Scanner;

public class While_Gugu {

	public static void main(String[] args) {
		int dan;
		int n=1;
		Scanner scan = new Scanner(System.in);
		System.out.print("* 단을 입력해 주세요 : ");
		dan = scan.nextInt();
		while(dan<=9){
			System.out.println("** "+dan+" 단 **");
			while(n<=9) {
				System.out.println(dan+" * "+n+" = "+dan*n);
				n++;
			}
			scan.close();
			break;
		}
	}
}
