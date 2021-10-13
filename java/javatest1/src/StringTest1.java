//java.lang ��Ű���� String Ŭ���� ���
//p.307
public class StringTest1 {

	public static void main(String[] args) {
		String a;  //a�� String ��ü�� ����ų �� �ִ� ����
		String b = "";
		String c = new String();  //������� ���ڿ� ����
		String d = new String("abc");
		String e = new String("abc");
		String f = "abc";
		
		System.out.println(d); 
		System.out.println(e);
		System.out.println(d == e); 	 //�ּҺ�
		System.out.println(d.equals(e)); //����� / d�� ����Ű�� ��ü�� ����� e�� ����Ű�� ��ü�� ������ ��

		System.out.println(d.length());  //���ڿ��� ���ڼ�
		System.out.println(d.charAt(0)); //0�� ���ڰ� �������� Ȯ��/���� �ε����� �����ϸ� ���ܹ߻�
		char ch = d.charAt(1);
		System.out.println(ch);
		
		System.out.println(d.indexOf('b')); //'b'�� ���° �ִ��� / ���� ���� ������ -1 �������� 
		System.out.println(d.equals("Abc")); //�����/��ҹ��� ������
		System.out.println(d.equalsIgnoreCase("ABC")); //��ҹ��� ���о���
		System.out.println(d.startsWith("a")); //�պκ��� ��ġ�ϴ���
		System.out.println(d.endsWith("c"));   //�޺κ��� ��ġ�ϴ���
		
		System.out.println(d.toLowerCase()); //�ҹ��� ��ȯ�� ����
		System.out.println(d.toUpperCase()); //�빮�� ��ȯ�� ����

		System.out.println(d.substring(1)); //1������ ������ �о��
		System.out.println(d.substring(0, 2)); //0������ 2�� ������ �о��
		
		a = "abc123abcABC";
		
		//a�� �� �������� -> 12
		System.out.println(a.length());
		System.out.println(a.length() * 2);
		//"123" �κи� ��� -> 123
		System.out.println(a.substring(3, 6));
		//"Abc"�� �����ϴ���? ��ҹ��� �����ϰ� �� -> true
//		String h = a.substring(0,3);
//		System.out.println(h.equalsIgnoreCase("Abc"));
		System.out.println(a.toUpperCase().startsWith("Abc".toUpperCase()));
		//���������� ��Ÿ���� 'c'�� �� ��°�� �ִ��� -> 8
		System.out.println(a.lastIndexOf('c'));
		
		
	}

}
