//3������ ������ ��� ���ϱ�
public class OpTest2 {

	public static void main(String[] args) {
		int k, e, m;
		k = 100;		//��������
		e = 90;			//��������
		m = 88;			//��������
		
		//�ʿ��� ������ ����
		int sum;
		double aver;
		
		//����Ͽ� ����� ������ ����
		sum = k + e + m;
		aver = sum / 3.0;
		
		//��� ���(����� �Ҽ��� �Ʒ��� ���)
		System.out.println("������ " + sum + "�̰�, ����� " + aver + "�Դϴ�.");
		
		//������ �ڵ�
		int total;
		double avg;
		
		total = k + e + m;
		avg = total / 3.0;
		
		System.out.print("������ " + total);      //println�� ����� �ٹٲٰ�, print�� ����� �ٹٲ��� ����, printf�� ���� ����������
		System.out.println(", ����� " + avg + "�Դϴ�.");
		
	}

}
