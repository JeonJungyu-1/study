//������ ����
public class OpTest3 {

	public static void main(String[] args) {
		int a, b, c;
		
		a = 10;
		c = a << 1;
		System.out.println(c);
		
		a = 10;
		b = 7;
		c = a & b;
		System.out.println(c);
		c = a | b;
		System.out.println(c);
		
		//���׿�����. ���ǿ�����.
		a = 10;
		b = 2;
		c = a > b? a : b;   // ����? true�� ������ �� ��: false�� ������ �� ��
		System.out.println(c);
		
		System.out.println(a > 0? "ū��" : "ũ������");
		
		byte d, e, f;
		d = 1;
		e = 2;
		f = (byte)(d + e);
		System.out.println(f);
	}

}

