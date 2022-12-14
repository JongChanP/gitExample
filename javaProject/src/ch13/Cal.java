package ch13;

import java.sql.Date;
import java.util.Calendar;

public class Cal {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);//월은 0~11(+1을해야함)
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));//12간제
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));//24시간제
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.get(Calendar.AM_PM));//오전 0 , 오후 1
		if(cal.get(Calendar.AM_PM)==0) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		//1년중 몇번째날
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		//월의 몇번째 날
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		//요일
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		String yoil = "";
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1 : yoil = "일요일"; break;
		case 2 : yoil = "월요일"; break;
		case 3 : yoil = "화요일"; break;
		case 4 : yoil = "수요일"; break;
		case 5 : yoil = "목요일"; break;
		case 6 : yoil = "금요일"; break;
		case 7 : yoil = "토요일"; break;
		}
		System.out.println("오늘은 "+yoil+"입니다.");
		//1년중 몇번째 주
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
	
		Date date=(Date) cal.getTime();
		
		System.out.println(date.getYear()+1900);
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDate());
		
	}
}
