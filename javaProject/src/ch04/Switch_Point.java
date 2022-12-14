package ch04;

public class Switch_Point {

	public static void main(String[] args) {
		int kor=85,mat=90,eng=70,tot=kor+eng+mat;
		double avg =tot/3.0;
		String grade = "";
		switch ( (int)(avg / 10 ) ) {//switch 안에는 정수만! avg는 double(실수)이다. 때문에 강제형변환
		//double 을 int로 강제 형변환
			case 10:
			case 9: grade = "수"; break;
			case 8: grade = "우"; break;
			case 7: grade = "미"; break;
			case 6: grade = "양"; break;
			default: grade = "가";
		}
		//결과 출력
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.printf("%d\t%d\t%d\t%d\t%3.1f\t%s",kor,eng,mat,tot,avg,grade);	
	}
}