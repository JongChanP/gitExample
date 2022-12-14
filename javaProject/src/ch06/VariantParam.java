package ch06;

public class VariantParam {

	public static void main(String[] args) {
		print("java");
		print("java","program");
		print("java","program","jsp");
		print("java","program","jsp","big","data");
		}
	static void print(String ...n) {//n이 가변형 매개변수
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i]);
		}
	}
	
	/*static void print(String a) {
		System.out.println(a);
	}
	static void print(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
	static void print(String a, String b, String c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	static void print(String a, String b, String c, String d, String e) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}*/
}
