package ch08;
//싱글톤 기법
public class MyManager {
	private int score;
	
	private MyManager(int score) {
		this.score=score;
	}
	
	private static MyManager mgr;
	
	public static MyManager getInstance() {
		if(mgr==null) {//처음 MyManager가 객체화 될때
			mgr=new MyManager(10);
		}
		return mgr;//한번 이상 객체 생성되었다면(주소값이 있으면) 그값을 리턴
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score=score;
	}
}
