package oop;

//Wrapper class - 1.기본자료형을 객체로 포장 2.기본자료형과 관련된 유용한 기능을 메소드로 제공

public class IntegerTest {

	public static void main(String[] args) {
		//Integer 객체 생성 (int -> Integer)
		Integer in1 = new Integer(100);
		//Integer 객체 생성 (String -> Integer)
		Integer in2 = new Integer("123");
		
		//Integer -> int
		int i = in1.intValue();
		//String -> int
		int i2 = Integer.parseInt("12"); //"1.234"
		
		//Integer -> String
		String s = in1.toString();
		//int -> String
		String s2 = Integer.toString(11);
		
		
		//진법 변환
		System.out.println(Integer.toString(31));
		System.out.println(Integer.toString(31, 2)); //10진수 int형을 2진수에 해당되는 문자열로 변환
		
		System.out.println(Integer.parseInt("11"));
		System.out.println(Integer.parseInt("11", 2)); //2진수에 해당하는 문자열을 10진수 int형으로 변환
	}

}
