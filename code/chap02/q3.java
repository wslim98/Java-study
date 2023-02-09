package chap02;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("원기둥의 밑면 반지름은? ");
		int r = in.nextInt();

		System.out.print("원기둥의 높이는? ");
		int h = in.nextInt();

		double result = r * r * 3.14 * h;
		System.out.printf("원기둥의 부피는 " + result);

		in.close();
	}
}