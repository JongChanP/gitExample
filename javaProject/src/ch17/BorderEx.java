package ch17;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderEx extends Frame{
	public BorderEx() {
		setTitle("BorderLayout 예제");
		setSize(500,400);
		setVisible(true);
		//버튼 생성
		Button b1 = new Button("east");
		Button b2 = new Button("west");
		Button b3 = new Button("south");
		Button b4 = new Button("north");
		Button b5 = new Button("center");
		
		//보더레이아웃은 Frame의 기본레이아웃이기 때문에 생략해도 된다.
		//setLayout(new BorderLayout());
		add(b1, "East");//East영역에 배치
		add(b2, "West");
		add(b3, "South");
		add(b4, "North");
		add(b5, "Center");//add(b5)
		//Frame일때 창닫기
		addWindowFocusListener(new WindowAdapter() {
			private void WindowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new BorderEx();
	}
}
