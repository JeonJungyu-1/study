
public class OpTest {

	public static void main(String[] args) {
		//������ �������
		int a, b, c;
		double x, y, z;
		
		a = 10;
		b = 3;
		
		c = a + b;  //++a*b  a++*b ���� �� p82�����ϱ�
		System.out.println(c);
		c = a % b;
		System.out.println(c);
		c = a - b * 2 + 1;
		System.out.println(c);
		c = (int)(a / 3 + b / 2.0);   //double�� ������ int���� ���� ���� �ִµ� int�� ������ double���� �������� ����  
		System.out.println(c);
		c = a / 3 + b / (int)2.0;
		System.out.println(c);
		x = a / 3 + b / 2.0;
		System.out.println(x);
		x = a / (3 + b) / 2.0;
		System.out.println(x);
		
		c = a + b + 1 + 3 + 5;
		c = a = b = 1;
		
		a = 0;
		b = 0;
		
		++a; 		// a = a + 1; ���׿�����
		System.out.println(a);
		a++;
		System.out.println(a);
		
		c = ++a;		//������ ����������
		System.out.println("a=" + a + ", c=" + c);
		c = a++;		//������ ���������� / ++�� ���ٰ� �����ϰ� ����Ŀ� 1�� ������/ ++a*2 a++*2 �ٸ���
		System.out.println("a=" + a + ", c=" + c);
		
		//c = ++a * a++;   //���� ���� ���� ����� / ���� ������� �ٸ� �� ����
		
		--a;
		System.out.println(a);
		
		c = c + b; //2���� ���� ����
		c += b;
		
		a += 1;    //3���� ���� ���� 
		a = a + 1;
		a++;
		
	}

}
