package ch02;

public class Light {

	public static void main(String[] args) {
		//long 타입은 8바이트(64비트)의 정수를 저장
		long lightspeed;
		long distance;
		
		lightspeed = 300000;//L은 생략가능(long 타입의 경우엔 끝에 L을 써야된다.)
		distance = lightspeed * 365L * 24 * 60 * 60;
		//빛이 1년 동안 가는거리 = 빛의속도 * 365일 * 24시 * 60분 * 60초
		System.out.println("빛이 1년 동안 가는거리 : " + distance + "km");

	}

}
