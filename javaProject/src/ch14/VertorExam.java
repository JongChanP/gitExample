package ch14;

import java.util.Vector;

//컬렉션(collection) > 배열의 단점을 보완한 클래스들
//배열의 단점 > 사이즈 조절이 안됨, 삽입,삭제가 어려움, 다양한 자료형을 저장할 수 없다
//Map계열 - 순서는 제공되지않지만 키가 제공됨(인덱스가 없고 키로 조회)
//List계열 - 순서대로 저장, 키가 없음(인덱스로 조회)
//Vertor 대신 요즘은 ArrayList를 많이 쓴다.
public class VertorExam {
	public static void main(String[] args) {
		//Vector v = new Vector(); 에러는 아니지만 아래처럼 처리하는게 좋다
		Vector<Object> v = new Vector();
		//모든자료형 처리가능
		//사이즈가 자동으로 늘어남
		System.out.println("초기사이즈 : "+v.capacity());
		//10개의 사이즈값을 기본으로 갖는다.
		v.add("first");//add("추가할 자료")
		v.add(2);
		v.add(3.5);
		v.add(true);
		v.add(100);
		v.add(101);
		v.add(103);
		v.add(104);
		v.add(105);
		v.add(106);//10개
		v.add(107);
		System.out.println("중간 사이즈 : "+v.capacity());
		//입력된 데이터가 벡터가 만들어놓은 초기 10개의 사이즈가 넘어가면
		//또 10개의 사이즈를 추가로 만든다.
		System.out.println("데이터의 개수 : "+v.size());//벡터.size()
		//참고 ) 배열은 length를 쓴다.
		System.out.println("초기 데이터");
		for(int i=0; i<v.size();i++) {
			System.out.print(v.get(i)+"\t");
			//주의점 : 배열[i]처럼 쓰면 안된다.
		}
		System.out.println();
		//v.remove(0);//벡터의 인덱스 0번요소 삭제
		v.add(6,102);//벡터의 인덱스 6번 자리에 데이터 102를 추가
		for(int i=0; i<v.size();i++) {
			System.out.print(v.get(i)+"\t");
		}
		System.out.println();
		
	}
}
