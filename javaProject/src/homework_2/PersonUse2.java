package homework_2;

public class PersonUse2 {

	public static void main(String[] args) {
		Person2 p1 = new Person2();
		p1.setName("홍길동");
		p1.setAge(30);
		p1.setEmail("hong@naver.com");
		p1.setAddress("서울 강남구 역삼동");
		p1.print();
		
		System.out.println();
	
		Person2 p2 = new Person2();
		p2.setName("사임당");
		p2.setAge(25);
		p2.setEmail("saimdang@gmail.com");
		p2.setAddress("서울 강남구 서초동");
		p2.print();
	}

}
