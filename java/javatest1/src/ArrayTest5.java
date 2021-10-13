
public class ArrayTest5 {

	public static void main(String[] args) {
		int num[] = { 3,7,1,5,2,20,23,13,16,37,14,19,17,11 };
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " ");
		}
		System.out.println();
		
		//오름차순으로 정렬
		int a;
//		for (int i = 0; i < num.length-1; i++) {
//			for (int j = i+1; j < num.length; j++) {
//				if (num[i] > num[j]) {
//					a = num[j];
//					num[j] = num[i];
//					num[i] = a;
//				}
//			}	
//		}
		
		int i = 0; 
		while (i < num.length-1) {
			int j = i+1;
			while (j < num.length) {
				if (num[i] > num[j]) {
					a = num[j];
					num[j] = num[i];
					num[i] = a;
				}
				j++;
			}
			i++;
		}
		
		
		for (i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		//선생님 코드
		for (i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int t = num[i];
					num[i] = num[j];
					num[j] = t;
				}
			}
		}
	}

}
