//if문, 논리연산자 ( &&, ||, ! )
public class IfTest4 {

	public static void main(String[] args) {
		int a, b;
		a = 5;
		b = 10;
		
		
		//&& 연산자
		if (a > 5 && b > 5) {
			System.out.println("O");
		}  //a > 5가 false가 나오면 뒤 수식은 검사도 안함/시간 절약하기 위함
		else {
			System.out.println("X");
		}
		//|| 연산자
		if (a > 5 || b > 5) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
		//a가 짝수인지?
		if (a % 2 == 0) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
		//a와 b가 둘다 짝수인지?
		if (a % 2 == 0 && b % 2 == 0) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
		//b가 a의 배수인지?
		if (b % a ==0) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
		//b가 2와 5의 공배수인지?
		if (b % 2 == 0 && b % 5 == 0) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
		//b가 3의 배수가 아닌지?
		if (b % 3 != 0) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
		//a,b가 둘다 짝수이면서 b가 a보다 크고 a가 0이상인가
		if ((a % 2 == 0) && (b % 2 == 0) && (b > a) && (a >= 0)) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
		//4년마다 윤년. 100년마다 아님. 400년마다는 무조건 윤년
		//-> 그 해가 4의 배수이면서 100의 배수가 아닌 경우 윤년. 그와 상관없이 400의 배수면 윤년
		int y = 2021;
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			System.out.println("윤년");
		}
		
		//2000 ~ 2020 기간인지? -> y가 2000보다 크거나 같다. 그리고 y가 2020보다 작거나 같다.
		if (y >= 2000 && y <= 2020) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
		//2000 ~ 2020 기간이 아닌지?
			//|| 사용
		if (y < 2000 || y > 2020) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
			//! 사용
		if (!(y >= 2000 && y <= 2020)) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}
		
		//&&, &, ||, | 차이
		a = 0;
		b = 0;
		//&&은 앞의 조건이 틀리면 뒤의 조건은 그냥 넘어감, &은 앞의 조건이 틀려도 뒤의 조건도 확인함.
		//||은 앞의 조건이 맞으면 뒤의 조건은 그냥 넘어감, |은 앞의 조건이 맞아도 뒤의 조건도 확인함.
		if (a > 1 && (++b > 1)) {  
			System.out.println("OO"); 
		}
		else {
			System.out.println("XX");
		}
		System.out.println(a + ", " + b);
	}

}
