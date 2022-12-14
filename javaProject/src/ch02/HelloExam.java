package ch02;

// 클래스 이름은 대문자로 시작
public class HelloExam {

	//메소드 이름은 소문자로 시작
	public static int sum(int n, int m) {
		return n + m;
	}
	public static int sum2(int n, int m) {
		return n / m;
	}
	//실행되는 메인 메소드(=함수)
	public static void main(String[] args) {
		int i = 20; //지역 변수 초기화(값을 저장, 변수에 할당한다)
	    int s;//지역변수 선언
	    char a;//지역변수 선언
	    
	   s = sum(i,10);
	   double s2 = sum2(30, 10);
	   a = '?';//단문자는 작은 따음표 ('),문자는 큰 따음표(")
	   System.out.println(a);
	   System.out.println("Hello");
	   System.out.println(s);
	   System.out.println(s2);
	}

}
