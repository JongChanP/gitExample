package ch08;

public class Book {
	private String bookName;//책이름
	private String author;//저자
	private String press;//출판사
	private int year;//출판년도
	private	int price;//책단가
	private int amount;//판매수량
	private int money;//판매 금액(책단가 * 판매수량)
	//기본 생성자
	public Book() {
		this("자바","김선생","한빛",2022,20000,15);//다른생성자 호출시 첫째줄에서 호출
		System.out.println("기본생성자 호출");
	}//매개변수가 있는 생성자
	public Book(String bookName, String author, String press, int year, int price, int amount) {
		this.bookName = bookName;
		this.author = author;
		this.press = press;
		this.year = year;
		this.price = price;
		this.amount = amount;
		money = price * amount;
	}
	
/*	public void input(String bookName, String author, String press, int year, int price, int amount) {
		this.bookName = bookName;
		this.author = author;
		this.press = press;
		this.year = year;
		this.price = price;
		this.amount = amount;
		money = price * amount;
	}*/
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(bookName+"\t"+author+"\t"+press+"\t"+year+"\t"+
		price+"\t"+amount+"\t"+money);
	}
}
