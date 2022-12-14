package ch12;

import ch11.Flyer;

public class InnerUse {
	public static void main(String[] args) {
		//인터페이스는 new 해서 객체생성이 불가능하다
		//하지만 무명클래스로의 형태로 생성할 수 있다.
		Flyer f = new Flyer() {//new 생성자(){}; =>무명내부클래스
			@Override
			public void takeOff() {
				System.out.println("takeoff");
			}
			
			@Override
			public void land() {
				
			}
			
			@Override
			public void fly() {
				
			}
		};//무명내부 클래스
		f.takeOff();
	}
}
