package ch19;

import java.net.HttpURLConnection;
import java.net.URL;

public class UrlConnectionExam {
//프로그램 <= 원격컴퓨터의 리소스 (InputStream)
//프로그램 => 원격컴퓨터의 리소스 (OutputStream)
	//1. 원격컴퓨터에 접속
	//2. 스트림생성
	//3. 입출력
	public static void main(String[] args) {
		URL url=null;
		try {
			url = new URL("http://google.com");
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			if(conn != null) {//접속되었으면
				//서버에서 일정시간 응답이 업승면 연결을 종료
				conn.setConnectTimeout(3000);//타임아웃시간설정
				StringBuilder sb = new StringBuilder();
				//정상적으로 처리된 경우
				if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
					//스트림을 사용해서 html source code를 읽어옴
					
				}
			}
		} catch (Exception e) {

		}
	}
}
