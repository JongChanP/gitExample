package ch05;
//배열
public class ArrayBasic {
	public static void main(String[] args) {
		int[] score = new int[5];//밑에 두줄을 한줄로 처리가능
		//int[] score;//배열 참조변수 선언
		//score = new int[5];//new를 통해 메모리에 5개의 int형
		//배열생성(4byte * 5 = 20 byte)
		System.out.println(score);//출력:[I@15db9742 < 메모리의 주소값
		//score는 메모리의 주소값을 가리키는 참조 변수가 된다.
		score[0] = 100;
		score[1] = 90;
		score[2] = 80;
		score[3] = 70;
		score[4] = 60;
//		int[] score = {100,90,80,70,60};//실무기법
		//score[5] = 50; 이렇게 하면 범위 초과가 되어 마지막 값은 n-1이다.
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);

		//배열을 다루는데 있어서 for문은 거의 필수적으로 사용된다.
		for(int i=0; i<5; i++) {
			System.out.println(score[i]);
		}
	}
}

