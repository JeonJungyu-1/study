import java.util.Scanner;
public class IfTest3 {

	public static void main(String[] args) {
		//0~100 ������ �Է¹޴´�.
		//90~100���� "��"��� ����Ѵ�.
		//80~90�̸��� "��"
		//70~80�̸��� "��"
		//60~70�̸��� "��"
		//60�̸��� "��"
		int score;
		Scanner input = new Scanner(System.in);
		
		System.out.print("����(0~100):");
		score = input.nextInt();
		if ( score >= 90 ) {
			System.out.println("��");
		}
		else if( score >= 80 ) {
			System.out.println("��");
		}
		else if( score >= 70 ) {
			System.out.println("��");
		}
		else if( score >= 60 ) {
			System.out.println("��");
		}
		else {
			System.out.println("��");
		}
		
		//������ �ڵ�
		int test ;
		System.out.print("����:");
		test = input.nextInt();
		if (test > 100)
			System.out.println("����");
		else if (test >= 90)
			System.out.println("��");
		else if (test >= 80)
			System.out.println("��");
		else if (test >= 70)
			System.out.println("��");
		else if (test >= 60)
			System.out.println("��");
		else if (test > 0)
			System.out.println("��");
		else 
			System.out.println("����");
		
	}

}
