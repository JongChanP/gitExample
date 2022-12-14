package ch05;

public class ArrayTest2 {

	public static void main(String[] args) {
		int sum=0; //총점용도
		float avg = 0f;//평균용도 변수
		int[] score = {100,80,100,100,90};
		for(int i=0; i<score.length; i++) {
			sum += score[i];//sum= sum+score[i]
		}
		avg = sum / (float)score.length;//계산결과를 float로 얻기위해 형변환
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}

}
