//java.lang 패키지의 String 클래스 사용
//p.307
public class StringTest1 {

	public static void main(String[] args) {
		String a;  //a는 String 객체를 가리킬 수 있는 변수
		String b = "";
		String c = new String();  //내용없는 문자열 생성
		String d = new String("abc");
		String e = new String("abc");
		String f = "abc";
		
		System.out.println(d); 
		System.out.println(e);
		System.out.println(d == e); 	 //주소비교
		System.out.println(d.equals(e)); //내용비교 / d가 가리키는 객체의 내용과 e가 가리키는 객체의 내용을 비교

		System.out.println(d.length());  //문자열의 글자수
		System.out.println(d.charAt(0)); //0번 글자가 무엇인지 확인/없는 인덱스에 접근하면 예외발생
		char ch = d.charAt(1);
		System.out.println(ch);
		
		System.out.println(d.indexOf('b')); //'b'가 몇번째 있는지 / 없는 글자 넣으면 -1 리턴해줌 
		System.out.println(d.equals("Abc")); //내용비교/대소문자 구분함
		System.out.println(d.equalsIgnoreCase("ABC")); //대소문자 구분안함
		System.out.println(d.startsWith("a")); //앞부분이 일치하는지
		System.out.println(d.endsWith("c"));   //뒷부분이 일치하는지
		
		System.out.println(d.toLowerCase()); //소문자 변환후 리턴
		System.out.println(d.toUpperCase()); //대문자 변환후 리턴

		System.out.println(d.substring(1)); //1번부터 끝까지 읽어옴
		System.out.println(d.substring(0, 2)); //0번부터 2번 전까지 읽어옴
		
		a = "abc123abcABC";
		
		//a가 몇 글자인지 -> 12
		System.out.println(a.length());
		System.out.println(a.length() * 2);
		//"123" 부분만 출력 -> 123
		System.out.println(a.substring(3, 6));
		//"Abc"로 시작하는지? 대소문자 무시하고 비교 -> true
//		String h = a.substring(0,3);
//		System.out.println(h.equalsIgnoreCase("Abc"));
		System.out.println(a.toUpperCase().startsWith("Abc".toUpperCase()));
		//마지막으로 나타나는 'c'는 몇 번째에 있는지 -> 8
		System.out.println(a.lastIndexOf('c'));
		
		
	}

}
