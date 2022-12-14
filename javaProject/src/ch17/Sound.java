package ch17;

import java.applet.AudioClip;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class Sound extends JApplet implements ActionListener{
	private AudioClip audio;//사운드처리 객체
	private JButton play,stop,loop;
	
	@Override
	public void init() {
		//화면 레이아웃 설정(애플릿 기본 레이아웃 - BorderLayout)
		setLayout(new FlowLayout());//FlowLayout으로 변경
		audio = getAudioClip(getClass().getResource("dingdong.wav"));
		//버튼을 애플릿에ㅔ 추가
		play = new JButton("Play");
		stop = new JButton("Stop");
		loop = new JButton("Loop");
		add(play);
		add(stop);
		add(loop);
		
		//버튼 클릭이베ㅔㄴ트 기능 추가
		play.addActionListener(this);
		stop.addActionListener(this);
		loop.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn=(JButton)e.getSource();
		//getSource()는 Object 타입이어서 좌변과 맞추어 형변환해줘야한다.
		System.out.println(e.getSource());
		if(btn == play) {
			audio.play();
		}else if(btn == stop) {
			audio.stop();
		}else if(btn == loop) {
			audio.loop();
		}
	}
}
