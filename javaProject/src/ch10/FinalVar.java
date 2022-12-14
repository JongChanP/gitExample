package ch10;

//final 변수 => 상수
//대문자로 작성, 2단어 이상일 경우 _로 연결
//초기값이 반드시 필요
//값을 변경할 수 없음
public class FinalVar {
	//멤버변수
	final static int MAX_NUM=500;
	//final static int MAX_NUM;=>final 처리한 상수는 선언만 할 시 에러
	
	public static void main(String[] args) {
		int max=100;
		System.out.println(max);
		System.out.println(MAX_NUM);
		//MAX_NUM=200;//final 처리한 상수변수는 값을 수정할 수 없음
	}
}
