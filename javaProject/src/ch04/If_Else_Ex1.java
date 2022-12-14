package ch04;

public class If_Else_Ex1 {

	public static void main(String[] args) {
		//if else 문
		int score = 90;//정수 초기화
		String result = "";// 문자열 초기화
		if(score >= 60) {
			result = "합격";
		}else {
			result = "불합격";
		}
		System.out.println(result);
	}

}
