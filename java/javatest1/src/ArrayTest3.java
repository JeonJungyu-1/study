//배열에 저장된 숫자 중에서 최대값 구하기
public class ArrayTest3 {

	public static void main(String[] args) {
		int ar[] = { 3,5,8,23,5,20,2,1,10,2 };
		int max = 0;
		
		
		max = ar[0];
		for (int i = 0; i < ar.length-1; i++ ) {
			if (max < ar[i+1]) {
				max = ar[i+1];
			}
		}
		System.out.println("최대값:" + max);
		
		//선생님 코드
		//첫번째 요소를 최대값으로 일단 정함
		max = ar[0];
		//나머지 숫자들과 모두 한번씩 비교하여 더 큰값을 만나면 max에 저장
		for (int i = 1; i < ar.length; i++) {
			if (max < ar[i]) {
				max = ar[i];
			}
		}
	}

}
