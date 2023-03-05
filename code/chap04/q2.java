package chap04;

class Triangle2 {
	private double s;	// 밑변 
	private double h;	// 높이 
	
	// 생성자
	public Triangle2(double s, double h) {
		this.s = s;
		this.h = h;
	}
	
	// 접근자 
	public double getS() {
		return s;
	}
	
	public double getH() {
		return h;
	}
	
	public double findArea() {
		return s * h * 0.5;
	}
	
	public boolean isSameArea(Triangle2 t) {
		if(t.findArea() == findArea()) {
			return true;
		}
		else
			return false;
	}
}

public class q2 {
	
	public static void main(String[] args) {
		Triangle2 t1 = new Triangle2(10.0, 5.0);
		Triangle2 t2 = new Triangle2(5.0, 10.0);
		Triangle2 t3 = new Triangle2(8.0, 8.0);
		
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}

}
