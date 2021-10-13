
public class javatest1 {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int result;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for (int i = 0; i < 18; i++) {
			result = a + b;
			System.out.print(result + " ");
			a = b;
			b = result;
		}
		
	}

}
