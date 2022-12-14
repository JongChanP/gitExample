package ch19;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class LanInfo {
	public static void main(String[] args) {
		try {
			//NetworkInterface : 랜카드 정보
			//getNetworkInterfaces():네트워크 인터페이스의 다양한 정보 제공
			Enumeration<NetworkInterface> enu = 
					NetworkInterface.getNetworkInterfaces();
			while (enu.hasMoreElements()) {//다음요소가 있으면 true
				NetworkInterface net=enu.nextElement();
				System.out.println(net
						);
			}
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
}
