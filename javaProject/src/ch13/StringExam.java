package ch13;

public class StringExam {
	public static void main(String[] args) {
		String str1 = new String("hello ");
		String str2 = new String("hello ");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println("====(==사용)====");
		if(str1==str2) {
			System.out.println("str1과 str2는 같은 인스턴스값을 참조");
		}
	}
}
