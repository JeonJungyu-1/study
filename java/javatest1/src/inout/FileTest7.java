/*
1.
������ ���ϸ� : a.txt
�̹� ������� �̸��Դϴ�. ����ðڽ��ϱ�? (y/n) y
����Ǿ����ϴ�.

2.
������ ���ϸ� : a.txt
�̹� ������� �̸��Դϴ�. ����ðڽ��ϱ�? (y/n) n
������ ���ϸ� : b.txt
����Ǿ����ϴ�.

3.
������ ���ϸ� : c.txt
����Ǿ����ϴ�.
 */

package inout;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		File filename = null;
		String s = null;
		String yn = null;
		FileWriter fw = null;
		
		a:
		while (true) {
			System.out.print("������ ���ϸ� : ");
			s = input.nextLine();
			filename = new File(s);
			
			if (filename.isFile()) {
				while (true) {
					System.out.print("�̹� ������� �̸��Դϴ�. ����ðڽ��ϱ�? (y/n) ");
					yn = input.nextLine();
					if (yn.equals("y")) {
						try {
							try {
								fw = new FileWriter(s);
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							fw.write("�����Ǿ����ϴ�");
							fw.close();
							System.out.println("����Ǿ����ϴ�.");
							continue a;
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					else if (yn.equals("n")) {
						continue a;
					}
					else {
						System.out.println("�ٽ� �Է��ϼ���.");
					}
				}
			}
			else {
				try {
					try {
						fw = new FileWriter(s);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					fw.write("�����Ǿ����ϴ�");
					fw.close();
					System.out.println("����Ǿ����ϴ�.");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			
		}

		
		
		//������ �ڵ�
		//���� ����, Scanner ��ü ����
//		Scanner keyin = new Scanner(System.in);
//		File file = null;
//		String filename = null;
//		String yn = null;
//		BufferedReader in = null;
//		FileWriter out = null;
//		
//		//���ϸ� �Է¹ް� �����ϴ��� Ȯ��. ������ �ٽ� �Է¹���
//		while (true) {
//			System.out.println("������ ���ϸ� �Է� : ");
//			filename = keyin.nextLine();
//			file = new File(filename);
//			if (file.isFile()) {
//				System.out.println("�̹� ������� �̸��Դϴ�. ����ðڽ��ϱ�? (y/n) ");
//				yn = keyin.nextLine();
//				if (yn.equalsIgnoreCase("y")) {
//					break;
//				}
//				else {
//					continue;
//				}
//			}
//			else {
//				break;
//			}
//		}
//		
//		try {
//			out = new FileWriter("a.txt");  // .\\a.txt ���� ���丮  / �Ѵܰ����� ..\
////			out = new FileWriter("C:\\scit\\a.txt");	//text ���� ������
//		} 
//		catch (IOException e) {
//			System.out.println("���� ���� ����");
//		}
//		
//		try {
//			out.write("��\n");	//���ڿ��� ���� �� ����
//			out.write("a\n");
//		} 
//		catch (IOException e) {
//			System.out.println("���� �� ����");
//		}
//		
//		
//		try {
//			out.close();			//�Ⱦ��� �������� �Ϻΰ� ����� �� ����/�����ϰ� ��Ʈ�� �ݾ���.
//		} 
//		catch (IOException e) {
//			System.out.println("���� �ݴ� �� ����");
//		}	
//		
	}

}
