package homework_2;

public class Member {
	private String name;
	private String id;
	private	int money;
	private String grade;
	
	public Member(String name, String id, int money) {
		this.name=name;
		this.id=id;
		this.money=money;		
		if(money >= 100000) {
			grade = "gold";
		}else {
			grade = "silver";
		}
	}
	public void print() {
		System.out.println("----------------------------------");
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println("----------------------------------");
		System.out.println(name+"\t"+id+"\t"+money+"\t"+grade);

	}
}
