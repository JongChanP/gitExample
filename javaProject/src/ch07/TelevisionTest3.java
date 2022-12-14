package ch07;

public class TelevisionTest3 {

	public static void main(String[] args) {
		Television myTv = new Television();//객체 생성
		System.out.println(myTv);
		myTv.channel =7;
		myTv.volume=9;
		myTv.onoff=true;
		myTv.print();
		
		Television yourTv = new Television();//다른 메모리번지수에 객체생성
		System.out.println(yourTv);
		yourTv.channel=9;
		yourTv.volume=12;
		yourTv.onoff=false;
		yourTv.print();
	}

}
