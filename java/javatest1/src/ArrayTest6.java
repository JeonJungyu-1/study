//다차원 배열
public class ArrayTest6 {

	public static void main(String[] args) {
		int a[][] = new int[3][4];   //3행 4열
		int b[][] = {{1,2,3},{4,5,6}}; //2행 3열
		
		System.out.println(b);
		System.out.println(b[0]);
		System.out.println(b[0][0]);
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.println(b[i][j]);
			}
		}
		
	}

}
