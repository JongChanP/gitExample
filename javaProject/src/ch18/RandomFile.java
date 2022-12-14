package ch18;

import java.io.RandomAccessFile;

public class RandomFile {
	public static void main(String[] args) {
		String str = null;
		try {//r: 읽기전용, w: 쓰기전용 rw:읽기쓰기
			RandomAccessFile file = new RandomAccessFile("c:\\test\\rand.txt","rw");
			//getFilePointer :파일 포인터(파일을 어디까지 읽엇는지 가리킴
			System.out.println(file.getFilePointer());//0
			file.seek(8);//8번째 인덱스부터
			System.out.println(file.getFilePointer());
			file.write("HTML".getBytes());//인덱스 8번 위치에서 기존내용을 덮어쓴다
			System.out.println(file.length());//문자길이확인
			System.out.println(file.getFilePointer());
			while(file.getFilePointer() < file.length()) {
				//파일의 내용보다 파일포인ㄴ터의 위치값이 적으면 반복
				str=file.readLine();
				//new String(문자열, 캐릭터셋)인코딩 방식 변환
				//한글처리
				//스트림.getBytes() - 스트림을 바이트배열로 변환
				//8859_1, ㅑ내-8859-1 :서유럽언어 인코딩방식
				//ms949 :2바이트
				//utf-8 : 3바이트 - 초성, 중성,종성 (각각 1byte)
				str = new String(str.getBytes("8859_1"),"utf-8");
				
			}
		} catch (Exception e) {
			
		}
	}
}
