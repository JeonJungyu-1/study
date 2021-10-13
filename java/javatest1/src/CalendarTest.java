import java.util.Calendar;
//ctrl + shift + M / import 자동추가
public class CalendarTest {

	public static void main(String[] args) {
		Calendar c;
		String a = new String();
		String b = new String();
		
		c = Calendar.getInstance();
		System.out.println(c);
		
		int y = c.get(Calendar.YEAR);				//년
		int m = c.get(Calendar.MONTH) + 1;				//월
		int d = c.get(Calendar.DATE);				//일
		int dow = c.get(Calendar.DAY_OF_WEEK);		//요일
		int ap = c.get(Calendar.AM_PM);				//오전, 오후 여부
		int h = c.get(Calendar.HOUR);
	    int mi = c.get(Calendar.MINUTE);
	    int sec = c.get(Calendar.SECOND);
		
		switch (dow) {
//			case 1: a = "일요일"; break;
//			case 2: a = "월요일"; break;
//			case 3: a = "화요일"; break;
//			case 4: a = "수요일"; break;
//			case 5: a = "목요일"; break;
//			case 6: a = "금요일"; break;
//			case 7: a = "토요일"; break;
			case Calendar.SUNDAY: 		a = "일요일"; break;
			case Calendar.MONDAY: 		a = "월요일"; break;
			case Calendar.TUESDAY: 		a = "화요일"; break;
			case Calendar.WEDNESDAY: 	a = "수요일"; break;
			case Calendar.THURSDAY:	 	a = "목요일"; break;
			case Calendar.FRIDAY: 		a = "금요일"; break;
			case Calendar.SATURDAY: 	a = "토요일"; break;
		}
		if (ap == 0) {
			b = "오전";
		}
		else {
			b = "오후";
		}
		//선생님 코드
//		String s2 = "오전"
//		if (ap == Calendar.PM) {
//			s2 = "오후";
//		}
		System.out.println(Calendar.YEAR);
		System.out.println(y + "년 " + m + "월 " + d + "일 " + a + " " + b + " " + h + "시 " + mi + "분 " + sec + "초입니다.");
		
		// 2021년 4월 26일 월요일 오전 11시 40분입니다.
	}

}
