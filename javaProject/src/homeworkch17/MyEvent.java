package homeworkch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;


public class MyEvent extends JFrame{
	private JButton button1,button2,button3,button4;
	public MyEvent() {
		setLayout(new BorderLayout());
		button1 = new JButton("Red");//버튼생성
		button2 = new JButton("Green");
		button3 = new JButton("Blue");
		button4 = new JButton("Yellow");
		
		//프레임에 버튼 추가
		add(button1,"North");	add(button2,"East");
		add(button3,"South");	add(button4,"West");
		
		//버튼에 이벤트 기능 추가
		button1.addActionListener(new MyEventColor(this,Color.red));
		button2.addActionListener(new MyEventColor(this,Color.green));
		button3.addActionListener(new MyEventColor(this,Color.blue));
		button4.addActionListener(new MyEventColor(this,Color.yellow));
		
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//현재 창만 닫음
	}
	public static void main(String[] args) {
		new MyEvent();
	}
}

