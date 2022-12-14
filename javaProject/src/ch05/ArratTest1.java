package ch05;

public class ArratTest1 {

	public static void main(String[] args) {
		int[] s = new int[10];//10개의 정수형 배열크기를 저장
		for(int i=0; i<s.length; i++) {
			s[i] = i;
			System.out.print(s[i] + " ");
		}
	}
}
