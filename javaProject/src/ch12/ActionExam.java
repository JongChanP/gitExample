package ch12;

abstract class Action{//추상클래스
	public abstract void exec();//추상메소드
}

public class ActionExam extends Action{

	@Override
	public void exec() {
		System.out.println("I am Chid");
	}
	public static void main(String[] args) {
		//추상클래스 = 자식클래스(다형성기법)
		Action a = new ActionExam(){//익명 내부 클래스
			String name = "kim";
			@Override
			public void exec() {
				System.out.println("나는 " + name+"이다.");
			}
		};//주의점:익명내부클래스의 마지막 중괄호 다음에 세미콜론이 명시되어야한다.
		a.exec();
	}
}	
