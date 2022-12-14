package ch17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame {
	//"Exit"만 메뉴아이템으로 별도생성
	private JMenuItem mie = new JMenuItem("Exit");
	public MenuEx() {
		super("Menu 예제");
		createMenu();
		setSize(300,200);
		setVisible(true);
		
	}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();//메뉴 바 생성
		JMenu jm = new JMenu("File");//메뉴생성
		jm.add(new JMenuItem("Open"));//메뉴에 메뉴아이템추가
		jm.add(new JMenuItem("Save"));
		jm.add(new JMenuItem("Print"));
		jm.addSeparator();//메뉴에 분리선 추가
		jm.add(mie);
		mb.add(jm);//메뉴바에 메뉴를 붙임
		mb.add(new JMenu("Edit"));//메뉴바에 메뉴추가
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		//프레ㅔ임에 메뉴바를 붙임(메뉴바는 프레임에만 붙일 수 있다.)
		setJMenuBar(mb);
		//"Exit"메뉴아이템을 누르면 프로그램 종료
		mie.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new MenuEx();
	}
}
