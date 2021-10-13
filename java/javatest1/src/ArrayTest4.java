
public class ArrayTest4 {

	public static void main(String[] args) {
		
//		//두 출력값은 같음
//		char ch = 'A';
//		System.out.println('A');
//		System.out.println(ch);
//		//int로 강제 형변환해서 유니코드 값 확인
//		System.out.println((int)ch + 2);
		
		char ch[] = {'G', 'E', 'X', 'B', 'A'};
		//문자형 배열인 경우에는 전체내용을 출력해줌
		System.out.println(ch);	//GEXBA
		System.out.println((int)ch[0]);
		System.out.println((int)'g');
		//모든 문자를 소문자로 변경
		for (int i = 0; i < ch.length; i++) {
			ch[i] += 32;
		}
		System.out.println(ch);	//gexba
		
		//선생님 코드
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char)(ch[i] + 32);
		}
		
		
		
		byte a = 0;
		int b = 0;
		//byte, short, char는 계산시에 항상 int로 바뀜/int와 long형이 만나면 long형으로 바뀜
		//a = a + 1;
		//결과는 같은데 계산방식이 약간 다름/위의식과 아래의 2개식 차이점
		a++;
		a += 1;
	}

}
