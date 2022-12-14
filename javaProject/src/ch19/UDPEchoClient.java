package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPEchoClient {
	private String str;
	private BufferedReader file;
	private static int SERVERPORT=3000;//서버측 포트번호 세팅
	public UDPEchoClient(String ip, int port) {
		try {
			InetAddress ia = InetAddress.getByName(ip);
			DatagramSocket ds = new DatagramSocket(port);
			System.out.print("서버측에서 보내는 메세지 :");
			file = new BufferedReader(new InputStreamReader(System.in));
			str = file.readLine();
			
			//String.getBytes() : 스트링을 바이트배열로 변환
			//new String(바이트배열) : 바이트배열을 스트링으로 변환
			byte buffer[] = str.getBytes();
			//String을 byte배열로 변환하여 전송(UDP통신에서는 바이트배열로 전송해야함)
			DatagramPacket dp = new DatagramPacket(buffer, buffer.length,ia,SERVERPORT);
			ds.send(dp);
			
			buffer = new byte[512];
			dp= new DatagramPacket(buffer, buffer.length);
			ds.receive(dp);//서버에서 보낸 메세지를 수신
			ds.close();
			System.out.println("server ip :"+dp.getAddress()+
					", server port : "+ dp.getPort());
			System.out.println("서버에서 보낸메세지 :"+ new String(dp.getData()).trim());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new UDPEchoClient("loaclhost", 2000);
	}
}
