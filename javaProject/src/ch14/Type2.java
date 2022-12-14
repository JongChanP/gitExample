package ch14;

public class Type2 {
	private Object value;
	public Object getValue() {//Object는 어떤 자료형이든 처리가능
		return value;
	}
	public void setValue(Object value) {
		this.value=value;
	}
	public static void main(String[] args) {
		Type2 t = new Type2();
		t.setValue("kim");
		System.out.println(t.getValue());
	//Object로도 가능하지만 시스템 적으로 부하가 많이 걸린다.
	//다른방법 Type3
	}
}
