package chap6;

class Point2 {
	int x, y;

	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
}

public class ex6_02 {

	public static void main(String[] args) {
		Point p = new Point(2, 3);
		System.out.println(p.toString());
		System.out.println(p); 
		System.out.println(p + "�Դϴ�.");
	}
}