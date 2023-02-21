package chap02;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		
		int num = in.nextInt();
		
		int result = num/100 + (num%100)/10 + num%10;
		System.out.printf("각 자릿수의 합 = %d", result);
		
		in.close();
	}
}
