/*
 * 1. �Է��ϴ� ��Ʈ������ string �ϳ��� �̾� �ٿ� ����/���� File�� ������ ���
 * 2. ��ü ���� �̿�(Arraylist)
 * 3. ������ File �����, ���� �Է��� ������ File�� �ӽ÷� ����/ ������ϸ� �ӽ����� �����, �����ϸ� �̸� �ٲ㼭 ���
 * 
 [�޸���]
������ �Է��ϼ���. ����� �� �࿡�� Enter.
1: abcd
2: �����ٶ�
3: 
�����Ͻðڽ��ϱ�? (y/n) y
���ϸ� : a.txt
�̹� ������� �̸��Դϴ�. ����ðڽ��ϱ�? (y/n) n
���ϸ� : a2.txt
a2.txt�� ����Ǿ����ϴ�.
 */
package inout;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Memo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = null;
		String st = "";
		String yn = null;
		String yn2 = null;
		int sel = 0;
		int num = 1;
		int ch;
		ArrayList<String> li = new ArrayList<String>();
		File temp = null;
		File filename = null;
		ObjectOutputStream out = null;
		ObjectInputStream in = null;
		FileWriter fw = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		
		//1
//		a:
//			while (true) {
//				System.out.println(" [�޸���]");
//				System.out.println("1. �Է�, 2. ���, 3. ����");
//				System.out.print("���� : ");
//				try {
//					sel = input.nextInt();
//				}
//				catch (InputMismatchException e) {
//				}
//				input.nextLine();
//				if (sel == 1) {
//					System.out.println("������ �Է��ϼ���.");
//					num = 1;
//					while (true) {
//						System.out.print(num + " : ");
//						s = input.nextLine();
//						if (s.isEmpty()) break;
//						st += (num + " : " + s + "\r\n");
//						num++;
//					}
//					
//					b:
//					while(true) {
//						System.out.print("�����Ͻðڽ��ϱ�? (y/n) ");
//						yn = input.nextLine();
//						
//						c:
//						while(true) {
//							if (yn.equalsIgnoreCase("y")) {
//								System.out.print("���ϸ� : ");
//								s = input.nextLine();
//								filename = new File(s);
//								if (filename.isFile()) {
//									
//									d:
//									while(true) {
//										System.out.print("�̹� ������� �̸��Դϴ�. ����ðڽ��ϱ�? (y/n) ");
//										yn2 = input.nextLine();
//										if (yn2.equalsIgnoreCase("y")) {
//											try {
//												fw = new FileWriter(s, false);
//												fw.write(st);
//												fw.close();
//											} catch (IOException e) {
//												e.printStackTrace();
//											}
//											System.out.println(s + "�� ����Ǿ����ϴ�.");
//											continue a;
//											
//										}
//										else if (yn2.equalsIgnoreCase("n")) {
//											continue c;
//										}
//										else {
//											System.out.println("�ٽ� �Է��ϼ���.(�̸�)");
//											continue d;
//										}
//									}
//								}
//								else {
//									try {
//										fw = new FileWriter(s, false);
//										fw.write(st);
//										fw.close();
//									} catch (IOException e) {
//										e.printStackTrace();
//									}
//									System.out.println(s + "�� ����Ǿ����ϴ�.");
//									continue a;
//								}
//							}
//							else if (yn.equalsIgnoreCase("n")) {
//								continue a;
//							}
//							else {
//								System.out.println("�ٽ� �Է��ϼ���.(����)");
//								continue b;
//							}
//						}
//						
//					}
//				}
//				else if (sel == 2) {
//					e:
//					while(true) {
//						System.out.print("����� ���ϸ� : ");
//						s = input.nextLine();
//						filename = new File(s);
//						if (filename.isFile()) {
//							try {
//								fr = new FileReader(s);
//								
//								while (true) {
//									if ((ch = fr.read()) != -1) {
//										System.out.print((char)ch);	
//									}
//									else if ((ch = fr.read()) == -1) {
//										System.out.println();
//										break;
//									}
//									
//									
//								} 
//								fr.close();
//							} catch (Exception e) {
//								e.printStackTrace();
//							}
//							continue a;
//						}
//						else {
//							System.out.println("���� �����Դϴ�.");
//							continue e;
//						}
//					}
//					
//					
//				}
//				else if (sel == 3) {
//					break;
//				}
//				else {
//					System.out.println("�ٽ� �Է��ϼ���(����)");
//				}
//			}
		
		
		//2
//		a:
//		while (true) {
//			System.out.println(" [�޸���]");
//			System.out.println("1. �Է�, 2. ���, 3. ����");
//			System.out.print("���� : ");
//			try {
//				sel = input.nextInt();
//			}
//			catch (InputMismatchException e) {
//			}
//			input.nextLine();
//			if (sel == 1) {
//				System.out.println("������ �Է��ϼ���.");
//				num = 1;
//				while (true) {
//					System.out.print(num + " : ");
//					s = input.nextLine();
//					if (s.isEmpty()) break;
//					li.add(s);
//					num++;
//				}
//				
//				b:
//				while(true) {
//					System.out.print("�����Ͻðڽ��ϱ�? (y/n) ");
//					yn = input.nextLine();
//					
//					c:
//					while(true) {
//						if (yn.equalsIgnoreCase("y")) {
//							System.out.print("���ϸ� : ");
//							s = input.nextLine();
//							filename = new File(s);
//							if (filename.isFile()) {
//								
//								d:
//								while(true) {
//									System.out.print("�̹� ������� �̸��Դϴ�. ����ðڽ��ϱ�? (y/n) ");
//									yn2 = input.nextLine();
//									if (yn2.equalsIgnoreCase("y")) {
//										try {
//											out = new ObjectOutputStream(new FileOutputStream(s));
//											out.writeObject(li);
//											out.close();
//										} catch (IOException e) {
//											e.printStackTrace();
//										}
//										System.out.println(s + "�� ����Ǿ����ϴ�.");
//										continue a;
//										
//									}
//									else if (yn2.equalsIgnoreCase("n")) {
//										continue c;
//									}
//									else {
//										System.out.println("�ٽ� �Է��ϼ���.(�̸�)");
//										continue d;
//									}
//								}
//							}
//							else {
//								try {
//									out = new ObjectOutputStream(new FileOutputStream(s));
//									out.writeObject(li);
//									out.close();
//								} catch (IOException e) {
//									e.printStackTrace();
//								}
//								System.out.println(s + "�� ����Ǿ����ϴ�.");
//								continue a;
//							}
//						}
//						else if (yn.equalsIgnoreCase("n")) {
//							continue a;
//						}
//						else {
//							System.out.println("�ٽ� �Է��ϼ���.(����)");
//							continue b;
//						}
//					}
//					
//				}
//			}
//			else if (sel == 2) {
//				e:
//				while(true) {
//					System.out.print("����� ���ϸ� : ");
//					s = input.nextLine();
//					filename = new File(s);
//					if (filename.isFile()) {
//						try {
//							in = new ObjectInputStream(new FileInputStream(s));
//							try {
//								while (true) {
//									ArrayList<String> list = (ArrayList<String>) in.readObject();
//									for (int i = 0; i < list.size(); i++) {
//										System.out.println((i+1) + " : " + list.get(i));	
//									}
//								} 
//							} catch (EOFException e) {
//							}
//							in.close();
//							
//						} catch (Exception e) {
//							e.printStackTrace();
//						}
//						continue a;
//					}
//					else {
//						System.out.println("���� �����Դϴ�.");
//						continue e;
//					}
//				}
//				
//				
//			}
//			else if (sel == 3) {
//				break;
//			}
//			else {
//				System.out.println("�ٽ� �Է��ϼ���(����)");
//			}
//		}
		
		//3
		a:
			while (true) {
				System.out.println(" [�޸���]");
				System.out.println("1. �Է�, 2. ���, 3. ����");
				System.out.print("���� : ");
				try {
					sel = input.nextInt();
				}
				catch (InputMismatchException e) {
				}
				input.nextLine();
				
				if (sel == 1) {
					System.out.println("������ �Է��ϼ���.");
					num = 1;
					temp = new File("temp.txt");
					while (true) {
						System.out.print(num + " : ");
						s = input.nextLine();
						if (s.isEmpty()) break;
						try {
							fw = new FileWriter("temp.txt", true);
							fw.write(num + " : " + s + "\r\n");
							fw.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
						num++;
					}
					
					b:
					while(true) {
						System.out.print("�����Ͻðڽ��ϱ�? (y/n) ");
						yn = input.nextLine();
						
						c:
						while(true) {
							if (yn.equalsIgnoreCase("y")) {
								System.out.print("���ϸ� : ");
								s = input.nextLine();
								filename = new File(s);
								if (filename.isFile()) {
									
									d:
									while(true) {
										System.out.print("�̹� ������� �̸��Դϴ�. ����ðڽ��ϱ�? (y/n) ");
										yn2 = input.nextLine();
										if (yn2.equalsIgnoreCase("y")) {
											filename.delete();
											temp.renameTo(filename);
											System.out.println(s + "�� ����Ǿ����ϴ�.");
											continue a;
											
										}
										else if (yn2.equalsIgnoreCase("n")) {
											continue c;
										}
										else {
											System.out.println("�ٽ� �Է��ϼ���.(�̸�)");
											continue d;
										}
									}
								}
								else {
									temp.renameTo(filename);
									System.out.println(s + "�� ����Ǿ����ϴ�.");
									continue a;
								}
							}
							else if (yn.equalsIgnoreCase("n")) {
								temp.delete();
								continue a;
							}
							else {
								System.out.println("�ٽ� �Է��ϼ���.(����)");
								continue b;
							}
						}
						
					}
				}
				else if (sel == 2) {
					e:
					while(true) {
						System.out.print("����� ���ϸ� : ");
						s = input.nextLine();
						filename = new File(s);
						if (filename.isFile()) {
							
							try {
								br = new BufferedReader(new FileReader(s));
							} catch (FileNotFoundException e1) {
								e1.printStackTrace();
							}
							try {
								while((s = br.readLine()) != null) {
									System.out.println(s);
								}
								br.close();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							continue a;
						}
						else {
							System.out.println("���� �����Դϴ�.");
							continue e;
						}
					}
					
					
				}
				else if (sel == 3) {
					break;
				}
				else {
					System.out.println("�ٽ� �Է��ϼ���(����)");
				}
			}
		
		
		//������ �ڵ�
		//�޸��� ���� 1. String ���
		
	}

}
