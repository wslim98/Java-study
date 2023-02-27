package chap03;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		do {
			System.out.print("양의 정수를 입력하세요: ");
			int num = in.nextInt();
			if (num <= 0)
				break;
			if (num % 2 == 0)
				sum += num;
		} while(true);
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
		in.close();
	}

}
