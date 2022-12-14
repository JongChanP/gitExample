package ch06;
//재귀호출- 실제 잘 사용안함(실수하면 메모리가 크게 증가)
//factorial 계산 : 5! = 5*4*3*2*1
public class RecursiveEx {
	static long fact1(int n) {
		return n==1 ? 1 : n*fact1(n-1);
	}
	public static void main(String[] args) {
		System.out.println(fact1(5));
	}
}
