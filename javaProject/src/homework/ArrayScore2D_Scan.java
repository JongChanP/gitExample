package homework;

import java.util.Scanner;

public class ArrayScore2D_Scan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하세요 : ");
		int m = sc.nextInt();
		int n=3;
		
		int[][] score = new int[m][n];
		System.out.println("국,영,수 점수를 각각 입력하세요 : ");
		for(int i=0; i<m; i++) {
			System.out.print((i+1)+"번 학생의 점수 :");
			for(int j=0; j<n; j++) {
				score[i][j]=sc.nextInt();
			}
		}
		System.out.println("----------------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("----------------------------------------------------");
		for(int i=0; i<score.length; i++) {
			int sum=0;//총점
			float avg=0.0f;//평균
			String grade = "";
			
			System.out.printf("%d\t", i+1);//번호출력
			for(int j=0; j<score[i].length; j++) {//국,영,수,배열값 출력
				sum += score[i][j];
				System.out.printf("%d\t", score[i][j]);
			}
			avg = sum/(float)score[i].length;//평균 계산
			switch ((int)(avg/10)){//float을 int로 변환
			case 10:
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
			}
			/*avg = sum/(float)score[i].length;//평균 계산
			if(avg > 90) grade = "A";
			else if(avg > 80) grade ="B";
			else if(avg > 70) grade ="C";
			else if(avg > 60) grade ="D";
			else grade="F";
			*///내가한거
			System.out.printf("%d\t %.1f\t %s%n", sum, avg, grade);
			System.out.println("----------------------------------------------------");
		}
	}
}