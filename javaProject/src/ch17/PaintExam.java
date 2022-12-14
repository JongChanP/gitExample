package ch17;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintExam extends JFrame{
	public PaintExam() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);	
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("hello java", 10, 60);//drawwString(문자열,x좌표,y좌표):그래픽인데 문자열 형태로 출력
		g.drawOval(30, 100, 50, 50);
		g.setColor(Color.blue);
		g.fillOval(100, 100, 50, 50);
		g.setColor(Color.yellow);
		g.fillRect(200, 200, 60, 60);
		System.out.println("paint 호출");
	}
	public static void main(String[] args) {
		new PaintExam();
	}
}
