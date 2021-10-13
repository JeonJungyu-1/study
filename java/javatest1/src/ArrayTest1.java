//배열 연습
public class ArrayTest1 {

	public static void main(String[] args) {
		int x;
		int a[];
		a = new int[5];  //배열은 만들면 자동으로 0으로 채워짐.
		//int a[] = new int[5];
		
		x = 99;
		//a = 99;
		a[0] = 99;
		//a -> 참조변수, 레퍼런스 변수.
		//a[0] 0부분 -> 첨자, 인덱스
		a[1] = 88;
		a[2] = 77;
		a[3] = 66;
		a[4] = 55;
		//a[5] = 44; 배열 범위 벗어남
		
		System.out.println(x);
		System.out.println(a); //java에서는 직접적으로 주소(실제 번지수)를 보여주지 않음/메모리에 있는 객체들을 구분하기 위한 번호 정도로 보면 됨

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");	
		}
		System.out.println();
		
		double b[] = new double[3]; //b 자체의 크기는 a와 동일함. 배열 한칸의 크기가 double이 되는것임.
		b[0] = 1.5;
		b[1] = 3.0;
		b[2] = 4.1;
		
		double c[] = {1.5, 3.0, 4.1}; //처음 생성할 때 한번만 사용가능함.
		
		char d[] = {'A', 'N', 'E', 'Q'};
		
		String e[] = {"aaa", "bbb", "ccc"};
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");	
		}
		System.out.println();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");	
		}
		System.out.println();
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");	
		}
		System.out.println();
		for (int i = 0; i < e.length; i++) {
			System.out.print(e[i] + " ");	
		}
		System.out.println();
		
		//Type mismatch: cannot convert from double to int
		
		
		int score[] = { 100, 90, 50, 60, 70 };
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		System.out.println("합계:" + sum);
		System.out.println("평균:" + (sum / score.length));
		
	}

}
