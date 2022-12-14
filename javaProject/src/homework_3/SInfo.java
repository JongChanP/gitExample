package homework_3;

public class SInfo implements Student {
	String name;
	String address;
	String email;
	int kor, eng, mat;
	
	@Override
	public void address() {	}
	@Override
	public void address(String name, String address, String email) {
		this.name = name;
		this.address = address;
		this.email = email;
	}
	@Override
	public void point() { }
	@Override
	public void point(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public void print() {
		int tot = kor+eng+mat;
		double avg = tot/3.0;
		System.out.println("=============================================");
		System.out.println("이름\t주소\t이메일");
		System.out.println(name+"\t"+address+"\t"+email);
		System.out.println("---------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot
				+"\t"+String.format("%4.1f", avg));
		System.out.println("=============================================");
	}
}