//9장 연습문제
public class PracL9 {
	private int x;
	private int y;
	
	public PracL9() {
		x = 0;
		y = 0;
	}
	
	public PracL9(int px, int py) {
		if (px>=0 && px<=100 && py>=0 && py<=100) {
			x = px;
			y = py;	
		}
	}
	
	
	
	public int getX() {
		return x;
	}
	
	public void setX(int px) {
		if (px>=0 && px<=100) {
			x = px;
		}
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int py) {
		if (py>=0 && py<=100) {
			y = py;	
		}
	}
	
	
}
