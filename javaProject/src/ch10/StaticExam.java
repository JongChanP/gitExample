package ch10;

//개별적인 값을 사용할 때 =>nonstatic ex)학생들
//공통적인 값을 계산할 때 => static ex)학생 4.0이상, 3.5이상 등

public class StaticExam {

	public static void main(String[] args) {
		int a=40, b=30, result;
		//대표저ㅓㄱ으로 자주사용하고 고정된값등,math 클래스 등은 final을 거의사용
		result = Math.max(a, b);
		System.out.println(result);
		
		result = Math.min(a, b);
		System.out.println(result);
		System.out.println(Math.sqrt(100));
		
		double r=15.3;
		System.out.println("원의 둘레 : "+2*Math.PI*r);
		System.out.println("원의 넓이 : "+Math.PI*r*r);
				
	}

}
