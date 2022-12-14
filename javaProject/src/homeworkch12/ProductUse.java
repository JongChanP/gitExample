package homeworkch12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductUse {
	private static void print(Map<String, Object> map) {
		ArrayList<Product> list2 = (ArrayList<Product>)map.get("list"); 
		System.out.println("---------------------------------------------------------");
		System.out.println("제품명\t제품코드\t제조사\t가격\t수량\t총액");
		System.out.println("---------------------------------------------------------");
		for(Product s : list2) {
			System.out.println(s.getName()+"\t"+s.getNum()+"\t"+s.getCompany()+"\t"+
					s.getPrice()+"\t"+s.getAmount()+"\t"+s.getMoney());
		}
		System.out.println("---------------------------------------------------------");
	}
		
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<>();
		List<Product> list = new ArrayList<>();
		System.out.println("2건의 제품정보를 입력하세요");
		Product p1 = new Product();
		p1.input();
		Product p2 = new Product();
		p2.input();
		list.add(p1);
		list.add(p2);
		map.put("list", list);
		print(map);
	}
}
