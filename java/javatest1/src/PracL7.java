import java.util.Scanner;

//7�� ��������
public class PracL7 {

	public static void main(String[] args) {
		//4�� ����
		Scanner input = new Scanner(System.in);
		System.out.println("5 ���� ���� ������ �Է��Ͻʽÿ�.");
		int sum = 0;
		int score[] = new int[5];
		for(int i = 0; i < 5; i++) {
			score[i] = input.nextInt();
			sum += score[i];
		}
		for(int i = 0; i < 5; i++) {
			System.out.println((i+1) + "��° ����� ������ " + score[i] + "�Դϴ�.");
		}
		for(int i = 0; i < score.length - 1; i++) {
			for(int j = i + 1; j < score.length; j++) {
				if(score[i] > score[j]) {
					int a = score[i];
					score[i] = score[j];
					score[j] = a;
				}
			}
		}
		System.out.println("���� ���� ������ " + score[score.length-1] + "���Դϴ�.");
	}

}
