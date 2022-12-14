package ch19;

import java.io.IOException;
import java.net.ServerSocket;

public class SocketExam {
	public static void main(String[] args) {
		//서버소켓 : 서버에서 서비스를 위한 목적으로 만드는 소켓
		ServerSocket socket = null;
		//포트번호 : 0~65535 내에서 배정이 가능하고 중복되지 않아야함
		//1port 1service
		//well known port number(자주사용하는 포트 번호)
		//80:웹서비스, 21:FTP서비스, 445:파일공유, 3389:원격접속
		//8080:오라클 DB기본포트
		
		for(int i=0; i<=65535; i++) {
			try {
				socket=new ServerSocket(i);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
