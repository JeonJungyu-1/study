import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 1. 정수를 반복 입력 받아 ArrayList에 저장(여러 개의 정수가 리스트에 저장됨)
 2. 정수 하나를 더 입력받음(몇 번째?)
 3. 전체 중에서 n번째로 큰 수 출력
 
 [예]
 [ 6,3,1,5,9 ]
 몇 번째? 2
 2번째로 큰 수는 6입니다. 
 */
public class ListTest5 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		int num;
		while (true) {
			System.out.print("정수 입력(0 입력하면 종료) : ");
			num = input.nextInt();
			if (num == 0) break;
			list.add(num);
		}
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.print("몇 번째? ");
		num = input.nextInt();
		System.out.println(list);
		System.out.println(num + "번째로 큰 수는 " + list.get(list.size() - num) + "입니다.");
		
		//선생님 코드
		int n;
		//중복 허용
		for( int i = 0; i < 5; i++) {
			System.out.println("정수 입력 :");
			n = input.nextInt();
			list.add(n);
		}
		
		//중복 불가
		for( int i = 0; i < 5; i++) {
			System.out.println("정수 입력 :");
			n = input.nextInt();
			if (list.indexOf(n) != -1) {
				i--;
				continue;
			}
			list.add(n);
		}
		
		for1:
		for( int i = 0; i < 5; i++) {
			System.out.println("정수 입력 :");
			n = input.nextInt();
			for (int j = 0; j < i; j++) {
				if (list.get(i) == list.get(j)) {
					i--;
					continue for1;
				}
			}
			list.add(n);
		}
		
		System.out.println("몇번째?");
		n = input.nextInt();
		if (n>list.size()) {
			System.out.println("범위를 벗어났습니다.");
			return;
		}
		
		System.out.println("입력한 값들:" + list);
		
		//방법 1 - 정렬 후 뒤에서부터의 순위를 계산
		Collections.sort(list);
		System.out.println("오름차순 정렬:" + list);
		System.out.println(n + "번째로 큰 수는 " + list.get(list.size() - n));
		//방법 2 - 정렬 후 배열내용을 역순으로
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println("내림차순 정렬:" + list);
		System.out.println(n+"번째로 큰 수는"+list.get(n - 1));
		//방법 3 - 내림차순 정렬
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println("내림차순 정렬:" + list);
		System.out.println(n+"번째로 큰 수는"+list.get(n - 1));
		
	}

}
