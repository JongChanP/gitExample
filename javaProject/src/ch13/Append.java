package ch13;

public class Append {
	public static void main(String[] args) {
		String a="hello";
		a= a+"java";
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		
		System.out.println("===가변형===");
		StringBuilder b = new StringBuilder("hello");
		System.out.println(System.identityHashCode(b));
		b.append("java");
		System.out.println(b);
		System.out.println(System.identityHashCode(b));
		
	}
}
