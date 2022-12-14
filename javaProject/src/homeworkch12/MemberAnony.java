package homeworkch12;

public class MemberAnony {
	public static void main(String[] args) {
		Member mb = new Member() {
			int num = 2;
			String name = "김길동";
			String email = "kim@gmail.com";
			@Override
			public void print() {
				System.out.println("------------------------");
				System.out.println("고객번호 : "+num);
				System.out.println("이름 : "+name);
				System.out.println("이메일 : "+email);
				System.out.println("------------------------");
			}
		};
		mb.print();
	}
}