package ch04;

public class Do_while_Ex2 {

	public static void main(String[] args) {
		int n=1;//초기식
		do {
			System.out.println(n+"Hello World");
			n++;//증감식
		}while(n<=10);
		System.out.println("while문 빠져나옴");
		
	}

}
