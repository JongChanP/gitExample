package homeworkch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.PrintStream;

public class FileCopy2 {

	public static void main(String[] args) {
		PrintStream ps=System.out;
		OutputStream stream=ps;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		String str="";
		BufferedReader reader=null;
		BufferedWriter writer=null;
		
		String file1="C:\\test\\abc.txt";
		String file2="C:\\test\\abcCopy.txt";
		
		try {
			stream = new FileOutputStream("C:\\test\\abc.txt");
			System.out.println("입력하세요 : ");
										
			while (true) {
				int ch=System.in.read();
				if(ch==13) break;
				stream.write(ch);
			} System.out.println("[파일이 저장되었습니다.]");	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			reader=new BufferedReader(new FileReader(new File(file1)));
			writer=new BufferedWriter(new FileWriter(new File(file2)));
			while (true) {
				str=reader.readLine(); 
				if(str==null) break;
				writer.write(str);
			}
			System.out.println("[파일 복사가 완료되었습니다.]");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) reader.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(writer != null) writer.close();
			} catch (Exception e2) {
				e2.printStackTrace();				
			}
		}
	}
	
}