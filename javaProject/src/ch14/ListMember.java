package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListMember {
	public static void main(String[] args) {
		//ArrayList<클래스 객체> = <Object>대신 만들어 놓은 Member객체를
		//제너릭하면 Member에서만 쓰이는 모든 자료형을 받을 준비가 가능해진다.
		List<Member> list = new ArrayList<>();
		
		//방법 1) Member 인스턴스 생성 후 setter활용
		Member m1=new Member();
		m1.setName("김철수");
		m1.setUserid("kim");
		m1.setPasswd("1234");
		m1.setTel("02-1234-5678");
		m1.setEmail("kim@gmail.com");
		
		//List에 Member 인스턴스를 추가
		list.add(m1);//ArrayList에 Member객체를 1개 추가
		System.out.println(list.size());
		
		//방법 2) setter를 안쓰고 생성자(매개변수)를 활용
		Member m2=new Member("hong","1234","홍길동","02-222-2222","hong@gmail.com");
		list.add(m2);//ArrayList에 Member객체를 또 1개 추가
		System.out.println(list.size());
		
		//방법 3) 참조변수를 사용 안하고 한번만 데이터를 사용하고 말거라면
		list.add(new Member("choi","1234","최철수","02-333-1111","choi@gmail.com"));
		System.out.println(list.size());
		
		System.out.println("이름\t아이디\t비밀번호\t전화번호\t\t이메일");
		for(int i=0;i<list.size();i++) {
			Member m=list.get(i);//여기서 m은 ArrayList의 각 데이터를 가리킬 임시 참조변수로 활용
			System.out.println(m.getName()+"\t"+m.getUserid()+"\t"+
			m.getPasswd()+"\t"+m.getTel()+"\t"+m.getEmail());
		}
	}
}
