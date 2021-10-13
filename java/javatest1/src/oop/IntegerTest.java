package oop;

//Wrapper class - 1.�⺻�ڷ����� ��ü�� ���� 2.�⺻�ڷ����� ���õ� ������ ����� �޼ҵ�� ����

public class IntegerTest {

	public static void main(String[] args) {
		//Integer ��ü ���� (int -> Integer)
		Integer in1 = new Integer(100);
		//Integer ��ü ���� (String -> Integer)
		Integer in2 = new Integer("123");
		
		//Integer -> int
		int i = in1.intValue();
		//String -> int
		int i2 = Integer.parseInt("12"); //"1.234"
		
		//Integer -> String
		String s = in1.toString();
		//int -> String
		String s2 = Integer.toString(11);
		
		
		//���� ��ȯ
		System.out.println(Integer.toString(31));
		System.out.println(Integer.toString(31, 2)); //10���� int���� 2������ �ش�Ǵ� ���ڿ��� ��ȯ
		
		System.out.println(Integer.parseInt("11"));
		System.out.println(Integer.parseInt("11", 2)); //2������ �ش��ϴ� ���ڿ��� 10���� int������ ��ȯ
	}

}
