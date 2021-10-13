
public class RandomTest {

	public static void main(String[] args) {
		int num[] = new int[6];
		int n;
		//6개의 1~45범위의 숫자 생성
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 45 + 1);
			//중복 확인
			for(int j = 0; j < i; j++) {
				if(num[i] == num[j]) {
					i--;
				}
			}
		}
		
		//선생님 코드
		//6개의 1~45범위의 숫자 생성
		out:
		for(int i = 0; i < num.length; i++) {
			n = (int)(Math.random() * 45 + 1);
			//중복 확인
			for(int j = 0; j < i; j++) {
				if (num[j] == n) {
					i--;
					continue out;
				}
			}
			num[i] = n;
		}
		
		//결과 출력
		System.out.print("[ ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println(" ]");
	}

}
