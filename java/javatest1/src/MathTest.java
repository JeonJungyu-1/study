
public class MathTest {

	public static void main(String[] args) {
		System.out.println(Math.sqrt(9));//제곱근
		System.out.println(Math.pow(2, 10));//첫번째 숫자를 두번째 숫자만큼 곱하기(2^10)
		
		System.out.println(Math.ceil(3.1));//소수점 아래 올림
		System.out.println(Math.floor(3.1));//소수점 아래 내림
		System.out.println(Math.round(3.1));//소수점 아래 반올림
		
		System.out.println(Math.max(1, 2));//큰 값
		System.out.println(Math.min(1, 2));//작은 값
		
		//0이상 1미만
		System.out.println(Math.random());
		//0 ~ 9
		System.out.println((int)(Math.random() * 10));
		//1 ~ 10
		System.out.println((int)(Math.random() * 10) + 1);
		
		
		//0 ~ 100
		int score[] = new int[100];
		for (int i = 0; i < score.length; i++) {
			score[i] = (int)(Math.random() * 101);
		}
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}

		System.out.println(Math.random());
	}

}
