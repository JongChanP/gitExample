package homework_2;

public class Employee2 {
	private String name;
	private String part;//부서
	private String position;//직위
	private int basic;//기본급
	private int bonus;//보너스(기본급의 300%)
	private int total;//총액(기본급 + 보너스)
	private int tax;//체액(총액의 3.3%)
	private int salary;//실수령액(총액 - 체액)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public int getBonus() {
		bonus = basic *3;
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getTotal() {
		total=basic + getBonus();
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTax() {
		tax=(int)(getTotal() * 0.033);//실수기 때문에 int로 강제형변환
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getSalary() {
		salary=getTotal() -getTax();
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void print() {
		System.out.println("이름\t부서\t직위\t기본급\t보너스\t총액\t체액\t실수령액");
		System.out.println(name+"\t"+part+"\t"+position+"\t"+basic+"\t"+getBonus()
				+"\t"+getTotal()+"\t"+getTax()+"\t"+getSalary());
	}
	
	

}
