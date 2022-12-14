package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExam extends JFrame{
	public PanelExam() {//기본생성자에서 GUI코드를 작성
		//패널에는 2개 이상의 컴포넌트를 배치할 수 있기 때문에, 버튼을 패널에
		//추가 후 패널을 프레임에 붙여 여러개의 컴포넌트를 처리할 수 있다.
		JPanel p = new JPanel();//패널생성
		p.setBackground(Color.red);//패널의 배경색상 설정
		//버튼설정(Swing은 한글처리가 잘 된다.
		JButton button1=new JButton("버튼 1");
		JButton button2=new JButton("버튼 2");
		JButton button3=new JButton("버튼 3");
		JButton button4=new JButton("버튼 4");
		JButton button5=new JButton("버튼 5");
		JButton button6=new JButton("버튼 6");
		
		p.add(button1);//패널에 버튼을 추가
		p.add(button6);
		//보더레이아웃에 버튼 및 패널을 추가
		add(p,BorderLayout.NORTH);
		add(button2);//보더레이아웃의 위치를 생략하면 center로 배치
		add(button3,"South");
		add(button4,"West");
		add(button5,"East");
	
		setSize(300,300);//화면사이즈설정
		setVisible(true);//프레임을 화면에 표시
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//윈도우 닫기버튼을 눌럿을 때(프로그램 완전 종료)
		
	}
	public static void main(String[] args) {
		new PanelExam();
	}
}
