//키보드로 정수를 입력받아 ArrayList에 저장
//0 입력하면 반복 종료
//합계를 구하여 출력
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ListTest2 {

	public static void main(String[] args) {
		int a = 0, sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("정수 입력 : ");
			a = input.nextInt();
			list.add(a);
			if (a == 0) {
				break;
			}
				
		}
		
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println("합계 : " + sum);
		
		System.out.println(list);
		//선생님 코드
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		int num, s = 0;
		
		//반복 입력 받음
		while (true) {
			System.out.print("정수입력:");
			num = input.nextInt();
			if (num == 0) break;
			list2.add(num);
		}
		
		//합계 구하기
		for (int i = 0; i < list2.size(); i++) {
			s += list2.get(i);
		}
		//결과 출력
		System.out.println(list2);
		System.out.println("합계:" + s);
		
		Collections.sort(list2);
		System.out.println(list2);
	}

}
