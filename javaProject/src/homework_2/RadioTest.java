package homework_2;

public class RadioTest {

	public static void main(String[] args) {
		Radio rad = new Radio();
		rad.name="브리츠";
		rad.channel=89.1;
		rad.volume=12;
		rad.print();
		
		Radio rad2 = new Radio();
		rad2.name="아이리버";
		rad2.channel=95.1;
		rad2.volume=9;
		rad2.print();
	}
}
