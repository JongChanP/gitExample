package homework;

public class ArraySum {

	public static void main(String[] args) {
		int sum = 0; //배열의 합계를 저장할 변수
        int[] num;//배열 참조변수 선언
		num = new int[5];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		for(int i=0; i<5; i++) {
			sum = sum + num[i];
		}
		System.out.println("합계 : "+sum);
	}

}
