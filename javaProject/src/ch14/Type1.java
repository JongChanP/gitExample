package ch14;

public class Type1 {
	private int value;
//	private double value2;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value=value;
	}
/*	public double getValue2() {
		return value2;
	}
	public void setValue2(double value2) {
		this.value2=value2;
	}*/
	//데이터 타입에 맞게 출력하려면 변수하나하나 마다 계속 생성해 주어야해서
	//다른방법을 사용하는게 더 좋다 >> Type2.java
	
	public static void main(String[] args) {
		Type1 t = new Type1();
		t.setValue(100);
		System.out.println(t.getValue());
	}
}
