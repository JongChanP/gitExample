package ch05;

public class Args {

	//입력한 매개변수들은 배열로 저장됨, args는 참조변수
	//이클립스 실행 : Run - Run configurations -  Arguments
	//탭에서 one two 입력 .. 실행
	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			System.out.println(i+"번째 매개변수 : " + args[i]);
		}
	}
}
