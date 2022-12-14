package homeworkch17;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import ch17.TextFieldEx;

public class MyGridLayout extends JFrame{
	public MyGridLayout() {
		super("그리드레이아웃 문제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,1));
		
		c.add(new JLabel("id"));
		c.add(new JTextField("hong",20));//필드크기 20
		c.add(new JLabel("비밀번호"));
		c.add(new JPasswordField(20));
		c.add(new JLabel("이메일"));
		c.add(new JTextField("hong@daum.net",20));
		c.add(new JLabel("HP"));
		c.add(new JTextField("010-1234-5678",20));
		
		setSize(500,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyGridLayout();
	}
}
