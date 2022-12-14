package homework_2;

public class Employee {
	private int num;//사원번호
	public String name;//이름
	String address;//주소
	String email;//이메일 주소
	protected int salary;//연봉
	private String rrn;//주민번호
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getRrn() {
		return rrn;
	}
	public void setRrn(String rrn) {
		this.rrn = rrn;
	}
}
