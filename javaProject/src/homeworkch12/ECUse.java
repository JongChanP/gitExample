package homeworkch12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ECUse {
	private static void print(Map<String, Object> map) {
		ArrayList<EC> list2 = (ArrayList<EC>)map.get("list");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("주문번호\t주문일자\t주문상품\t카드명\t카드번호\t결제금액");
		System.out.println("---------------------------------------------------------------------");
		for(EC s : list2) {
			System.out.println(s.getNo()+"\t"+s.getOrderDate()+"\t"+s.getProduct()+"\t"+
					s.getCardName()+"\t"+s.getCardNo()+"\t"+s.getPay());
		}
		System.out.println("---------------------------------------------------------------------");
		
	}
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<>();
		List<EC> list = new ArrayList<>();
		list.add(new EC(1234,"2022-08-24","하이트맥주","삼성","37918****68",55900));
		list.add(new EC(2345,"2022-09-11","꼬깔콘","롯데","35691****45",23600));
		list.add(new EC(3456,"2022-10-29","노트북","현대","36160****82",2600000
				));
		map.put("list", list);
		print(map);
	}
}
