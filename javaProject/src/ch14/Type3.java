package ch14;
//<T> 제너릭
public class Type3<T> {//자료형이 미정인 상태<아무문자나>
	T t;//변수도 자료형 미정
	public void setT(T t) {//메소듣 자료형 미정
		this.t=t;
	}
	public T getT() {
		return t;
	}
	public static void main(String[] args) {
		//인스턴스를 생성할 때 자료형을 결정함. > 제너릭(일반화)이라 함
		Type3<String> t = new Type3<String>();
		t.setT("hello");
		System.out.println(t.getT());
		
		Type3<Integer> t2=new Type3<Integer>();
		t2.setT(100);
		System.out.println(t2.getT());
		
		Type3<Double> t3=new Type3<Double>();
		t3.setT(100.1);
		System.out.println(t3.getT());
	}
}
