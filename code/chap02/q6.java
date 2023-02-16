package chap02;

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("화씨 온도 입력: ");
		
		double f = in.nextDouble();
		double c = (f-32)*5/9;
		
		System.out.printf("섭씨 온도는 %f입니다.", c);
		
		in.close();
	}
}
