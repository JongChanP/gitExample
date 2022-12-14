package ch18;

import java.awt.Container;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SwingFileIo extends JFrame implements ActionListener{
	Container cp;
	JButton btnSave, btnLoad;
	JTextArea ta;
	
	public SwingFileIo(String title) {
		super(title);
		cp=this.getContentPane();//프레임위의 기본패널
		this.setBounds(100,100,400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setDesign();
		this.setVisible(true);
		
	}
	
	public void setDesign() {
		JPanel pTop=new JPanel();
		btnSave=new JButton("Save File");
		btnLoad=new JButton("Load File");
		pTop.add(btnSave);
		pTop.add(btnLoad);
		this.add("North", pTop);//보더레이아웃의 North영역에 패널 배치
		
		ta=new JTextArea();
		JScrollPane sp = new JScrollPane(ta);
		this.add("Center",sp);//Center 영역에 textarea관련 패널배치
		
		btnSave.addActionListener(this);
		btnLoad.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob=e.getSource();
		if(ob==btnSave) {//파일 저장기능
			FileDialog fd= new FileDialog(this, "savig file", FileDialog.SAVE);
			fd.setVisible(true);
			String filename=fd.getDirectory();
			if(fd.getFile()==null) {
				return;
			}
			FileWriter fw = null;
			try {
				fw=new FileWriter(filename);
				fw.write(ta.getText());
				ta.setText("saved");
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}else if(ob==btnLoad) {//파일 불러오기 기능
			FileDialog dlg = new FileDialog(this, "open file", FileDialog.LOAD);
			dlg.setVisible(true);
			String filename=dlg.getDirectory()+dlg.getFile();
			if(dlg.getFile()==null)
				return;
			FileReader fr=null;
			try {
				fr=new FileReader(filename);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			BufferedReader br=null;
			br= new BufferedReader(fr);
			ta.setText("");//""은 이전글 모두삭제
			while (true) {
				String line="";
				try {
					line=br.readLine();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				if(line==null)
					break;
				ta.append(line+"\n");
			}
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}//end actionPerformd()
	public static void main(String[] args) {
		new SwingFileIo("파일 입출력");
	}
}
