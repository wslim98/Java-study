package chap02;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("초 단위 정수를 입력하세요 : ");
		int seconds = in.nextInt();
		
		int hour = seconds / 3600;
		int minute = (seconds % 3600) / 60;
		int second = seconds % 60;
		
		System.out.printf("%d시간 %d분 %d초", hour, minute, second);
	}
}
