import java.util.Calendar;
import java.util.Scanner;
public class StringTest3 {

	public static void main(String[] args) {
		String id;
		Scanner input = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ �Է� (000000-0000000 ����):"); //991101-1234567
		id = input.next();
		
		
		//14���ڰ� �ƴϸ� �����޽��� ��� �� ���α׷� ����
		if (id.length() != 14) {
			System.out.println("�Է� ����");
			return;
		}
		//6�� ���ڰ� '-'�� �ƴϸ� ����
		if (id.charAt(6) != '-') {
			System.out.println("�Է� ����");
			return;
		}
		//���� 1~12�� �ƴϸ� ����
		if (Integer.parseInt(id.substring(2,4)) < 1 || Integer.parseInt(id.substring(2,4)) > 12) {
			System.out.println("�� �Է� ����");
			return;
		}
		//���� 1~31�� �ƴϸ� ����
		if (Integer.parseInt(id.substring(4,6)) < 1 || Integer.parseInt(id.substring(4,6)) > 31) {
			System.out.println("�� �Է� ����");
			return;
		}
		//������ 1,2,3,4�� �ƴϸ� ����
		if (Integer.parseInt(id.substring(7,8)) < 1 || Integer.parseInt(id.substring(7,8)) > 4) {
			System.out.println("���� �Է� ����");
			return;	
		}
		else {
			if (Integer.parseInt(id.substring(7,8)) >= 3 && Integer.parseInt(id.substring(7,8)) <= 4) {
				if (Integer.parseInt(id.substring(0,2)) > 21 && Integer.parseInt(id.substring(0,2)) <= 99) {
					System.out.println("�� �Է� ����");
					return;
				}
			}
		}
			
		//�����Է��� ���
		// 99�� 11�� 1�ϻ� 22�� ����
		int age = 0;
		if (Integer.parseInt(id.substring(7,8)) >= 1 && Integer.parseInt(id.substring(7,8)) <= 2) {
			age = 121 - Integer.parseInt(id.substring(0,2));
		}
		else if (Integer.parseInt(id.substring(7,8)) >= 3 && Integer.parseInt(id.substring(7,8)) <= 4) {
			age = 21 - Integer.parseInt(id.substring(0,2));
		}
		
		if (Integer.parseInt(id.substring(7,8))==1 || Integer.parseInt(id.substring(7,8))==3) {
		System.out.println(id.substring(0,2) + "�� " + id.substring(2,4) + "�� " + id.substring(4,6) + "�ϻ� " + age + "�� ����");
		}
		else if (Integer.parseInt(id.substring(7,8))==2 || Integer.parseInt(id.substring(7,8))==4) {
			System.out.println(id.substring(0,2) + "�� " + id.substring(2,4) + "�� " + id.substring(4,6) + "�ϻ� " + age + "�� ����");	
		}
		
		//������ �ڵ�
		//6�� ���ڰ�  '-'�� �ƴϸ� ���� 
//		if (id.indexOf('-') != 6)
//		if (!id.substring(6,7).equals("-")) //�տ� !���̸� �����ʳ� ���°���.
		if (id.charAt(6) != '-') {
			System.out.println("�Է� ����");
			return;
		}
		
		int year = Integer.parseInt(id.substring(0,2));
		int month = Integer.parseInt(id.substring(2,4));
		int day = Integer.parseInt(id.substring(4,6));
		char ch = id.charAt(7);			// '1', '2', '3', '4'
		
		//���� 1~12�� �ƴϸ� ����
		if (month < 1 || month > 12) {
			System.out.println("�Է� ����");
			return;
		}
		
		//���� 1~31�� �ƴϸ� ����
		if (day < 1 || day > 31) {
			System.out.println("�Է� ����");
			return;
		}
		
		//������ 1,2,3,4�� �ƴϸ� ����
		//if (ch != '1' && ch != '2' && ch != '3' && ch!= '4')
		//if (ch == '1' || ch == '2' || ch == '3' || ch == '4')
		if (ch < '1' || ch > '4') {
			System.out.println("�Է� ����");
			return;
		}
		
		//�����Է��� ���
		// 99�� 11�� 1�ϻ� 22�� ����
		age = 2021 - year;
//		age = c.get(Calendar.YEAR) - year;
		if (ch == '1' || ch == '2') {
			age -= 1900;
		}
		else {
			age -= 2000;
		}
		
		String s = "����";
		//if (ch % 2 == 0)  //¦�� �̸� ����
		if (ch == '2' || ch == '4') {
			s = "����";
		}
		
		System.out.println(year + "�� " + month + "�� " + day + "�ϻ� " + age + "�� " + s);
		
		
	
	}

}
