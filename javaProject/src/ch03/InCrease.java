package ch03;

public class InCrease {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		j = i++; //i의 값을 1 증가시킴
		System.out.println(i + "," + j);
		i = 5;
		j = ++i;//i의 값을 1 증가(먼저 계산)
		System.out.println(i + "," + j);
		

	}

}
