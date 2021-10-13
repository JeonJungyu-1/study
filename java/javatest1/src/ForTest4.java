//중첩된 for문
public class ForTest4 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("------------");

		/*
				1 2 3 4 5
				1 2 3 4 5
				1 2 3 4 5
		*/
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("------------");
		
		/*
				1 2 3 4 5
				2 3 4 5
				3 4 5
				4 5
				5
		*/
		int n = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = n; j <= 5; j++) {
				System.out.print(j + " ");
			}
			n++;
			System.out.println();
		}
		System.out.println("------------");
			//선생님 코드
			for (int a = 1; a < 6; a++) {
				for (int b = a; b < 6; b++) {
					System.out.print(b + " ");
				}
				System.out.println();
			}
			System.out.println("------------");
		
		/*
				1 2 3 4 5
				2 3 4 5 6
				3 4 5 6 7
				4 5 6 7 8
				5 6 7 8 9
		*/
		
		n = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = n; j <= n + 4; j++) {
				System.out.print(j + " ");
			}
			n++;
			System.out.println();
		}
		System.out.println("------------");
			//선생님 코드
			for (int a = 1; a < 6; a++) {
				for (int b = a; b < a + 5; b++) {
					System.out.print(b + " ");
				}
				System.out.println();
			}
			System.out.println("------------");

		
		/*
				1 2 3 4 5
				1 2 3 4 
				1 2 3 
				1 2 
				1
		*/
		n = 5;
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j + " ");
			}
			n--;
			System.out.println();
		}
		System.out.println("------------");
			//선생님 코드
			for (int a = 5; a > 0; a--) {
				for (int b = 1; b <= a; b++) {
					System.out.print(b + " ");
				}
				System.out.println();
			}
			System.out.println("------------");
		
		
		/*
				1 0 0 0 0
				0 1 0 0 0
				0 0 1 0 0
				0 0 0 1 0
				0 0 0 0 1
		*/
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j) {
					System.out.print(1 + " ");
				}
				else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
		System.out.println("------------");
			//선생님 코드 /if문 사용
			for (int a = 0; a < 5; a++) {
				for (int b = 0; b < 5; b++) {
					if (a == b) {
						System.out.print(1 + " ");	
					}
					else {
						System.out.print(0 + " ");	
					}
					
				}
				System.out.println();
			}
			System.out.println("------------");
			//선생님 코드2 /조건연산자 사용
			for (int a = 0; a < 5; a++) {
				for (int b = 0; b < 5; b++) {
					System.out.print((a == b? 1:0) + " ");
				}
				System.out.println();
			}
			System.out.println("------------");
		
	}

}
