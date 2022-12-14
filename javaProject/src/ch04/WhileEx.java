package ch04;

public class WhileEx {

	public static void main(String[] args) {
		int i=1;//초기식
		while (i<=10) {//조건식
			System.out.println(i);
			i++;//증감식
		}//while문의 장점 무한 루프
		//for 문
		for(int j=1; j<=10; j++) {
			System.out.println(j);
		}

	}

}
