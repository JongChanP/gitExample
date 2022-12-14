package ch17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyColorAction implements ActionListener{
	private JFrame f;
	private Color c;
	private Container con;
	//Container : 다른 컴포넌트를 담을수있는 요소
	//contentPane : 스윙에서는 contentPane에 컴포넌트들을 부착할 수 있는데,
	//contentPane은 JFrame 객체가 처음 생길때 자동으로 생성되며
	//getContentPane()메소드를 사용해 얻을 수 있다
	public MyColorAction(JFrame f, Color c) {
		this.f = f;
		con = f.getContentPane();//프레임의 컨텐츠 영역
		this.c = c;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);//배경색상설정
		
	}

}
