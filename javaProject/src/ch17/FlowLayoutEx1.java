package ch17;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx1 extends JFrame{
	public FlowLayoutEx1() {
		setTitle("FlowLayout 기본예제");//프레임제목
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//원래 JFrame,Frame의 기본 레이아웃은 BorderLayout이다.
		//FlowLayout으로 레이아웃 변경 시에는
		setLayout(new FlowLayout());
		//setLayout(new FlowLayout(FlowLayout.LEFT, 30,40));
		//왼쪽 정렬, 컴포넌트간의 좌우간격 30픽셀, 상하간격 40픽셀로 옵션 설정
		//레이아웃에 버튼 생성 및 추가
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("4"));
		add(new JButton("5"));
	}
	public static void main(String[] args) {
		new FlowLayoutEx1();
	}
}
