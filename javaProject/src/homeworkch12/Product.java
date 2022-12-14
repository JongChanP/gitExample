package homeworkch12;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Product {
	private String num;//제품번호
	private String name;//제품명
	private String company;//제조사
	private int price;//단가
	private int amount;//수량
	private int money;//금액
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("제품번호 : ");
		num=scan.next();
		System.out.print("제품명 : ");
		name=scan.next();
		System.out.print("제조사 : ");
		company=scan.next();
		System.out.print("단가 : ");
		price=scan.nextInt();
		System.out.print("수량 : ");
		amount=scan.nextInt();
		money = price*amount;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getMoney() {
		return price*amount;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Product() {
	}
	public Product(String num, String name, String company, int price, int amount) {
		this.num = num;
		this.name = name;
		this.company = company;
		this.price = price;
		this.amount = amount;
	}
}