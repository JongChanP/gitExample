package homeworkch12;

public class AutoBox2 {
	public static void main(String[] args) {
		//기본자료형
		int num1;
		int num2;
		int num3;
		//참조자료형(객체자료형)
		Integer i1=new Integer(30);//auto boxing
		Integer i2=new Integer(40);//auto boxing
		Integer i3=new Integer(50);//auto boxing
		
		num1 = i1;
		num2 = i2;//auto unboxing(객체안에 들어있는값을 풀어서 저장)
		num3 = i3;
		System.out.println("기본자료형 : "+num1+", 객체자료형 : "+i1);
		System.out.println("기본자료형 : "+num2+", 객체자료형 : "+i2);
		System.out.println("기본자료형 : "+num3+", 객체자료형 : "+i3);
		}
}
