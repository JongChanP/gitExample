package homework;

import java.util.Scanner;

public class ArrayPoint2 {

	public static void main(String[] args) {
		String name[] = new String[2];
		int kor[]= new int[2];
		int eng[]= new int[2];
		int mat[]= new int[2];
		int tot[]= {0,0};
		double avg[]= new double[2];
		double tot_avg=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("2명의 학생의 국,영,수 점수를 각각 입력하세요 .");
		for(int i=0; i<name.length; i++) {//이때는 반드시 참조변수.length을 써야한다.
			System.out.print("이름 : ");	
			name[i] = scan.next();
			System.out.print("국어 : ");
			kor[i] = scan.nextInt();
			System.out.print("영어 : ");
			eng[i] = scan.nextInt();
			System.out.print("수학 : ");
			mat[i] = scan.nextInt();
			}
		for(int i=0;i<2;i++) {
			tot[i]=kor[i]+eng[i]+mat[i];
			avg[i]=tot[i]/3.0;
			tot_avg=tot_avg+avg[i];//전체학생에 대한 평균처리
		}
		scan.close();
		System.out.println("[성적 출력]");
		System.out.println("이름\t국어\t수학\t영어\t총점\t평균");
		for(int i=0;i<2;i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]
					+"\t"+tot[i]+"\t"+String.format("%4.1f", avg[i]));
		}
		System.out.println("=============================");
		System.out.println("학급 평균 : "+String.format("%4.1f", tot_avg/2));
	
	}

}
