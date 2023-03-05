package chap04;

class Triangle {
	private double s;	// 밑변 
	private double h;	// 높이 
	
	// 생성자
	public Triangle(double s, double h) {
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
}

public class q1 {
	
	public static void main(String[] args) {
		Triangle t = new Triangle(10.0, 5.0);
		System.out.println(t.findArea());
	}

}
