package homework_2;

public class Auction {
	private String name;
	private String id;
	private	int money;
	private String grade;
	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getGrade() {
		if(money >= 100000) {
			grade = "gold";
		}else {
			grade = "silver";
		}
		return grade;
	}
	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+id+"\t"+money+"\t"+getGrade());
	}
}
