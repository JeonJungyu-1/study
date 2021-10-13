package oop;

public class Point implements Comparable<Point> {
	private int x;
	private int y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//toString() 오버라이딩
	@Override
	public String toString() {
		return "[ x : " + x + ", y : " + y + " ]";
	}
	
	//a.equals(b)
	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if ((this.x == p.x) && (this.y == p.y)) {
			return true;
		}
		else {
			return false;
		}
	}

	//양쪽 객체를 비교해서 this가 크면 양수, 같으면 0, this가 작으면 음수
	@Override
	public int compareTo(Point o) {
		if (this.x + this.y > o.x + o.y) {
			return 1;
		}
		else if (this.x + this.y < o.x + o.y) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	
}
