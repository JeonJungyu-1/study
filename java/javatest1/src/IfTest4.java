//if��, �������� ( &&, ||, ! )
public class IfTest4 {

	public static void main(String[] args) {
		int a, b;
		a = 5;
		b = 10;
		
		
		//&& ������
		if (a > 5 && b > 5) {
			System.out.println("O");
		}  //a > 5�� false�� ������ �� ������ �˻絵 ����/�ð� �����ϱ� ����
		else {
			System.out.println("X");
		}
		//|| ������
		if (a > 5 || b > 5) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
		//a�� ¦������?
		if (a % 2 == 0) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
		//a�� b�� �Ѵ� ¦������?
		if (a % 2 == 0 && b % 2 == 0) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
		//b�� a�� �������?
		if (b % a ==0) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
		//b�� 2�� 5�� ���������?
		if (b % 2 == 0 && b % 5 == 0) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
		//b�� 3�� ����� �ƴ���?
		if (b % 3 != 0) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
		//a,b�� �Ѵ� ¦���̸鼭 b�� a���� ũ�� a�� 0�̻��ΰ�
		if ((a % 2 == 0) && (b % 2 == 0) && (b > a) && (a >= 0)) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
		//4�⸶�� ����. 100�⸶�� �ƴ�. 400�⸶�ٴ� ������ ����
		//-> �� �ذ� 4�� ����̸鼭 100�� ����� �ƴ� ��� ����. �׿� ������� 400�� ����� ����
		int y = 2021;
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			System.out.println("����");
		}
		
		//2000 ~ 2020 �Ⱓ����? -> y�� 2000���� ũ�ų� ����. �׸��� y�� 2020���� �۰ų� ����.
		if (y >= 2000 && y <= 2020) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
		//2000 ~ 2020 �Ⱓ�� �ƴ���?
			//|| ���
		if (y < 2000 || y > 2020) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
			//! ���
		if (!(y >= 2000 && y <= 2020)) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
		
		//&&, &, ||, | ����
		a = 0;
		b = 0;
		//&&�� ���� ������ Ʋ���� ���� ������ �׳� �Ѿ, &�� ���� ������ Ʋ���� ���� ���ǵ� Ȯ����.
		//||�� ���� ������ ������ ���� ������ �׳� �Ѿ, |�� ���� ������ �¾Ƶ� ���� ���ǵ� Ȯ����.
		if (a > 1 && (++b > 1)) {  
			System.out.println("OO"); 
		}
		else {
			System.out.println("XX");
		}
		System.out.println(a + ", " + b);
	}

}
