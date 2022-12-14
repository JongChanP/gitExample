package ch03;

public class CastEx {
//자료형병환
	public static void main(String[] args) {
		float f = 1.6F; //4바이트로 저장
		System.out.println(f);
		
		//자동형변환(정수100을 자동으로 float형 실수 100.0f로 변환)
		f = 100;//원래는 에러인데 자동형변환을 해줘서 에러아님
		System.out.println(f);
		
		f = 100.5F;
		int i = (int)f;//강제형변환
		System.out.println(i);
		
	}

}
