package ch08;

public class BookUse {

	public static void main(String[] args) {
		Book b=new Book("java","홍길동","영진",2019,35000,5);
/*		b.input("DB", "아무개", "한빛", 2022, 20000, 3);*/
		b.print();
		
		Book b2=new Book();
		b2.print();
	}

}
