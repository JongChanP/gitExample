package homework_2;

public class ManagerTest {

	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.input(
				20220101, "홍길동", "서울 강남구", 
				"hong@gmail.com", 3000, "123456-1234567");
		m1.print();
	}
}
