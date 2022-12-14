package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student("202201", "김철수", "국사", 1, "박교수"));
		list.add(new Student("202202", "박찬호", "영문", 2, "최교수"));
		list.add(new Student("202203", "홍길동", "전산", 3, "김교수"));
		System.out.println("학번\t이름\t전공\t학년\t지도교수");
//		for(int i=0;i<list.size();i++) {
//			Student s =list.get(i);//리스트.get(인덱스)
//			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+
//			s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		
		for(Student s : list) {//실무용 향상된 포문
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+
					s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
	}
}
