import java.util.Scanner;
public class IfTest2 {

	public static void main(String[] args) {
		int time, money;
		Scanner input = new Scanner(System.in);
		//�ٹ� �ð��� �Է¹޾� time������ ����
		System.out.print("�ٹ� �ð� : ");
		time = input.nextInt();
		//�ٹ��ð��� 30�ð� �̸��̸� �ñ� 7000��, 30�̻� 50�̸��̸� 8000��, 50�̻� �ٹ� �� 10000��
//		if (time >= 0 && time < 30) {
//			money = time * 7000;
//		}
//		else if (time >=30 && time < 50) {
//			money = time * 8000;
//		}
//		else if (time >= 50) {
//			money = time * 10000;
//		}
//		else {
//			System.out.println("�ٽ� �Է��ϼ���.");
//		}
		if (time < 30) {
		money = time * 7000;
		}
		else if (time < 50) {
			money = time * 8000;
		}
		else {
			money = time * 10000;
		}
		//�� �޿��� ����ؼ� ���
		System.out.println("�� �޿� : " + money);
		
		//������ �ڵ�
		int pay = 0;
		
		System.out.print("�ٹ��ð�?");
		time  = input.nextInt();
		
		if (time < 30) {
			pay = time * 7000;
		}
		else if (time < 50) {
			pay = time * 8000;
		}
		else {
			pay = time * 10000;
		}
		
		System.out.println("�޿�:" + pay);
	}

}
