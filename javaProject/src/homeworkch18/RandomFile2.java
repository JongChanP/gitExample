package homeworkch18;

import java.io.RandomAccessFile;

public class RandomFile2 {

	public static void main(String[] args) {
		String str=null;
		try { 
			RandomAccessFile file=new RandomAccessFile("C:\\test\\rand2.txt", "rw");			
			System.out.println(file.getFilePointer());
			file.seek(8);
			System.out.println(file.getFilePointer());
			file.write("park".getBytes());
			System.out.println(file.length());
			System.out.println(file.getFilePointer());
			while (file.getFilePointer() < file.length()) {
				str=file.readLine(); 
				str = new String(str.getBytes("8859_1"), "utf-8");
			}
			System.out.println(file.length());
			System.out.println(file.getFilePointer());
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
