package ch07;

public class TelevisionTest5 {
	public static void main(String[] args) {
		Television myTv = new Television();
		myTv.setChannel(11);
		int ch = myTv.getChannel();
		System.out.println("현재 채널은 "+ch+"입니다.");
	}//myTv.setChannel(11)이걸로 Television의 setChannel에 저장
	//channel = 11로 기억 ch는 getChannel로 인해 11 호출
}
