import java.util.Calendar;
//ctrl + shift + M / import �ڵ��߰�
public class CalendarTest {

	public static void main(String[] args) {
		Calendar c;
		String a = new String();
		String b = new String();
		
		c = Calendar.getInstance();
		System.out.println(c);
		
		int y = c.get(Calendar.YEAR);				//��
		int m = c.get(Calendar.MONTH) + 1;				//��
		int d = c.get(Calendar.DATE);				//��
		int dow = c.get(Calendar.DAY_OF_WEEK);		//����
		int ap = c.get(Calendar.AM_PM);				//����, ���� ����
		int h = c.get(Calendar.HOUR);
	    int mi = c.get(Calendar.MINUTE);
	    int sec = c.get(Calendar.SECOND);
		
		switch (dow) {
//			case 1: a = "�Ͽ���"; break;
//			case 2: a = "������"; break;
//			case 3: a = "ȭ����"; break;
//			case 4: a = "������"; break;
//			case 5: a = "�����"; break;
//			case 6: a = "�ݿ���"; break;
//			case 7: a = "�����"; break;
			case Calendar.SUNDAY: 		a = "�Ͽ���"; break;
			case Calendar.MONDAY: 		a = "������"; break;
			case Calendar.TUESDAY: 		a = "ȭ����"; break;
			case Calendar.WEDNESDAY: 	a = "������"; break;
			case Calendar.THURSDAY:	 	a = "�����"; break;
			case Calendar.FRIDAY: 		a = "�ݿ���"; break;
			case Calendar.SATURDAY: 	a = "�����"; break;
		}
		if (ap == 0) {
			b = "����";
		}
		else {
			b = "����";
		}
		//������ �ڵ�
//		String s2 = "����"
//		if (ap == Calendar.PM) {
//			s2 = "����";
//		}
		System.out.println(Calendar.YEAR);
		System.out.println(y + "�� " + m + "�� " + d + "�� " + a + " " + b + " " + h + "�� " + mi + "�� " + sec + "���Դϴ�.");
		
		// 2021�� 4�� 26�� ������ ���� 11�� 40���Դϴ�.
	}

}
