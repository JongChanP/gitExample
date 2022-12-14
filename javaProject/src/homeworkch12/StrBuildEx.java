package homeworkch12;

public class StrBuildEx {
	public static void main(String[] args) {
		String str1 = "I am a";
		String str2 = " Java Programmer";
	StringBuilder str = new StringBuilder();
	str.append(str1);
	str.append(str2);
	System.out.println("--------------------------------------------");
	System.out.println("append()메소드를 활용 : "+str);

	str.replace(7, 11, "JSP");
	System.out.println("replace()메소드를 활용 : "+str);
	
	System.out.println("substring()메소드를 활용 : "+str.substring(7));
	System.out.println("--------------------------------------------");
	
	}
}
