package ch19;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {
	public static void main(String[] args) throws MalformedURLException{
		String website="https://imgnews.pstatic.net/image/139/2022/12/13/0002176821_001_20221213113001357.jpg?type=w647";
		System.out.println("다운로드를 시작합니다.");
		URL url=new URL(website);
		//byte 배열
		byte[] buffer=new byte[2048];//버퍼용 바이트배열[2mb]
		//try with문 (java 1.7)
		//finally가없어도 리소스를 자동으로 종료
		//try(리소스 선언부){
		//}catch(Exception e){
		//}
		try(InputStream in = url.openStream();
				OutputStream out=new FileOutputStream("c:\\test\\test.jpg")) {
			int length=0; //length읽은 바이트수 리턴
			//더이상 읽을 내용이 없으면 -1
			while((length=in.read(buffer)) != -1) {//읽을 내용이 있으면
				System.out.println(length+"바이트읽음");
				out.write(buffer,0,length);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
