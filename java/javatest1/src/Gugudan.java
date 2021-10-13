//구구단
public class Gugudan {

	public static void main(String[] args) {
		//구구단 1개단
//		for (int i = 1; i < 10; i++) {
//			System.out.println(3 + " * " + i + " = " + (3 * i));
//		}
		
		//continue는 현재회수만 넘기고 다음회수로 넘어감, break는 현재 for문만 끝냄, return은 프로그램을 끝냄.
//		out:
//		for (int a = 1; a <= 9; a++) {
//			for (int b = 1; b <= 9; b++) {
//				if (b == 3) {
//					//break out; //중첩문 모두 끝낼 수 있음.
//					continue out;
//				}
//				System.out.println(a + " * " + b + " = " + (a * b));
//			}
//			System.out.println();
//		}
//		System.out.println("구구단 끝");
		
		//1
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				System.out.println(a + " * " + b + " = " + (a * b));
			}
			System.out.println();
		}
		
		//2 옆으로 출력
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				System.out.print(b + "*" + a + "=" + (a * b) + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		//3 3단씩 출력
		for (int a = 1; a <= 7; a += 3) {
			for (int i = a; i <= a + 2; i++) {
				System.out.print(i + "단" + "\t\t");	
			}
			System.out.println();
			for (int b = 1; b <= 9; b++) {
				for (int c = a; c <= a + 2; c++) {
					System.out.print(c + " * " + b + " = " + (c * b) + "\t");	
				}
				System.out.println();
			}
			System.out.println();
		}
			//선생님 코드
			for (int a = 1; a < 9; a += 3) {
				for (int b = 1; b <= 9; b++) {
					for (int c = a; c < a + 3; c++) {
						System.out.print(c + "*" + b + "=" + (c * b) + "\t");
					}
					System.out.println();
				}
				System.out.println();
			}

	}
}
