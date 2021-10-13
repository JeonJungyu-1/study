/*
 * 1. 입력하는 스트림들을 string 하나에 이어 붙여 놓음/그후 File에 저장후 사용
 * 2. 객체 저장 이용(Arraylist)
 * 3. 무조건 File 만들고, 한줄 입력할 때마다 File에 임시로 저장/ 저장안하면 임시파일 지우고, 저장하면 이름 바꿔서 사용
 * 
 [메모장]
내용을 입력하세요. 종료는 새 행에서 Enter.
1: abcd
2: 가나다라
3: 
저장하시겠습니까? (y/n) y
파일명 : a.txt
이미 사용중인 이름입니다. 덮어쓰시겠습니까? (y/n) n
파일명 : a2.txt
a2.txt가 저장되었습니다.
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
//				System.out.println(" [메모장]");
//				System.out.println("1. 입력, 2. 출력, 3. 종료");
//				System.out.print("선택 : ");
//				try {
//					sel = input.nextInt();
//				}
//				catch (InputMismatchException e) {
//				}
//				input.nextLine();
//				if (sel == 1) {
//					System.out.println("내용을 입력하세요.");
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
//						System.out.print("저장하시겠습니까? (y/n) ");
//						yn = input.nextLine();
//						
//						c:
//						while(true) {
//							if (yn.equalsIgnoreCase("y")) {
//								System.out.print("파일명 : ");
//								s = input.nextLine();
//								filename = new File(s);
//								if (filename.isFile()) {
//									
//									d:
//									while(true) {
//										System.out.print("이미 사용중인 이름입니다. 덮어쓰시겠습니까? (y/n) ");
//										yn2 = input.nextLine();
//										if (yn2.equalsIgnoreCase("y")) {
//											try {
//												fw = new FileWriter(s, false);
//												fw.write(st);
//												fw.close();
//											} catch (IOException e) {
//												e.printStackTrace();
//											}
//											System.out.println(s + "가 저장되었습니다.");
//											continue a;
//											
//										}
//										else if (yn2.equalsIgnoreCase("n")) {
//											continue c;
//										}
//										else {
//											System.out.println("다시 입력하세요.(이름)");
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
//									System.out.println(s + "가 저장되었습니다.");
//									continue a;
//								}
//							}
//							else if (yn.equalsIgnoreCase("n")) {
//								continue a;
//							}
//							else {
//								System.out.println("다시 입력하세요.(저장)");
//								continue b;
//							}
//						}
//						
//					}
//				}
//				else if (sel == 2) {
//					e:
//					while(true) {
//						System.out.print("출력할 파일명 : ");
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
//							System.out.println("없는 파일입니다.");
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
//					System.out.println("다시 입력하세요(선택)");
//				}
//			}
		
		
		//2
//		a:
//		while (true) {
//			System.out.println(" [메모장]");
//			System.out.println("1. 입력, 2. 출력, 3. 종료");
//			System.out.print("선택 : ");
//			try {
//				sel = input.nextInt();
//			}
//			catch (InputMismatchException e) {
//			}
//			input.nextLine();
//			if (sel == 1) {
//				System.out.println("내용을 입력하세요.");
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
//					System.out.print("저장하시겠습니까? (y/n) ");
//					yn = input.nextLine();
//					
//					c:
//					while(true) {
//						if (yn.equalsIgnoreCase("y")) {
//							System.out.print("파일명 : ");
//							s = input.nextLine();
//							filename = new File(s);
//							if (filename.isFile()) {
//								
//								d:
//								while(true) {
//									System.out.print("이미 사용중인 이름입니다. 덮어쓰시겠습니까? (y/n) ");
//									yn2 = input.nextLine();
//									if (yn2.equalsIgnoreCase("y")) {
//										try {
//											out = new ObjectOutputStream(new FileOutputStream(s));
//											out.writeObject(li);
//											out.close();
//										} catch (IOException e) {
//											e.printStackTrace();
//										}
//										System.out.println(s + "가 저장되었습니다.");
//										continue a;
//										
//									}
//									else if (yn2.equalsIgnoreCase("n")) {
//										continue c;
//									}
//									else {
//										System.out.println("다시 입력하세요.(이름)");
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
//								System.out.println(s + "가 저장되었습니다.");
//								continue a;
//							}
//						}
//						else if (yn.equalsIgnoreCase("n")) {
//							continue a;
//						}
//						else {
//							System.out.println("다시 입력하세요.(저장)");
//							continue b;
//						}
//					}
//					
//				}
//			}
//			else if (sel == 2) {
//				e:
//				while(true) {
//					System.out.print("출력할 파일명 : ");
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
//						System.out.println("없는 파일입니다.");
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
//				System.out.println("다시 입력하세요(선택)");
//			}
//		}
		
		//3
		a:
			while (true) {
				System.out.println(" [메모장]");
				System.out.println("1. 입력, 2. 출력, 3. 종료");
				System.out.print("선택 : ");
				try {
					sel = input.nextInt();
				}
				catch (InputMismatchException e) {
				}
				input.nextLine();
				
				if (sel == 1) {
					System.out.println("내용을 입력하세요.");
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
						System.out.print("저장하시겠습니까? (y/n) ");
						yn = input.nextLine();
						
						c:
						while(true) {
							if (yn.equalsIgnoreCase("y")) {
								System.out.print("파일명 : ");
								s = input.nextLine();
								filename = new File(s);
								if (filename.isFile()) {
									
									d:
									while(true) {
										System.out.print("이미 사용중인 이름입니다. 덮어쓰시겠습니까? (y/n) ");
										yn2 = input.nextLine();
										if (yn2.equalsIgnoreCase("y")) {
											filename.delete();
											temp.renameTo(filename);
											System.out.println(s + "가 저장되었습니다.");
											continue a;
											
										}
										else if (yn2.equalsIgnoreCase("n")) {
											continue c;
										}
										else {
											System.out.println("다시 입력하세요.(이름)");
											continue d;
										}
									}
								}
								else {
									temp.renameTo(filename);
									System.out.println(s + "가 저장되었습니다.");
									continue a;
								}
							}
							else if (yn.equalsIgnoreCase("n")) {
								temp.delete();
								continue a;
							}
							else {
								System.out.println("다시 입력하세요.(저장)");
								continue b;
							}
						}
						
					}
				}
				else if (sel == 2) {
					e:
					while(true) {
						System.out.print("출력할 파일명 : ");
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
							System.out.println("없는 파일입니다.");
							continue e;
						}
					}
					
					
				}
				else if (sel == 3) {
					break;
				}
				else {
					System.out.println("다시 입력하세요(선택)");
				}
			}
		
		
		//선생님 코드
		//메모장 예제 1. String 사용
		
	}

}
