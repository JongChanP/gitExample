package ch05;

public class GetMinMax {

	public static void main(String[] args) {
		int[] score = {79,88,991,33,100,55,95};
		int max = score[0];//배열의 첫번째 값으로 초기화
		int min = score[0];
		for(int i=1; i<score.length; i++) {
			if(score[i]>max) {
				max = score[i];
			}else if(score[i]<min) {
				min = score[i];
			}
		}//end for
		System.out.println("최대값 : " +max);
		System.out.println("최소값 : " +min);
	}
}
