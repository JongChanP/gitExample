package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
	public static void main(String[] args) {
		String str="";
		BufferedReader reader=null;
		BufferedWriter writer=null;
		
		String file1="C:\\test\\aa.txt";
		String file2="C:\\test\\b.txt";
		try {
			reader = new BufferedReader(new FileReader(file1));
			writer = new BufferedWriter(new FileWriter(file2));
					while(true) {
						str = reader.readLine();
						//한라인을 읽음ex)aaa\r\n이 라인의 끝으로 인식
						if(str == null) break;
						//파일을 기록할때도 \r\n을 써줘야함
						// \r carriage return(캐리지 리턴)
						// \n new line(줄바꿈)
						writer.write(str+"\r\n");
					}
					
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
