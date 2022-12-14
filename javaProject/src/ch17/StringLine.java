package ch17;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

//JApplet은 Applet의 확장판으로 1995년 처음소개됨
//에플릿뷰어나 웹브라우저와 함께 쓰엿으며 게임 및 다양한 그래픽을 구사할 수 있다.
//현재는 HTML5등 웹이 진화되면서 거의 활용되지 않는다
//라이프 사이클을 가지고있다 init()-start()-stop()-destroy()
//init()은 필수처리이며 나머지는 자동으로 처리된다
public class StringLine extends JApplet {
	
	@Override
	public void init() {//애플릿을 초기화하는 코드
		getContentPane().setBackground(new Color(255,255,255));//배경색상설정
		setSize(500,500);//애플릿 화면사이즈
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);
		//선그리기(x1,y1,x2,y2)
		g.drawLine(250, 50, 30, 160);
		
		g.setColor(Color.red);
		g.drawString("Red string", 10,50);
	}
}
