package chap02;

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		// 1번
		if ((num%4==0)&&(num%5==0))
			System.out.println("true");
		else
			System.out.println("false");
		
		// 2번
		if ((num%4==0)||(num%5==0))
			System.out.println("true");
		else
			System.out.println("false");
				
		// 3번
		if ( ((num%4==0)||(num%5==0)) && (num%20!=0) )
			System.out.println("true");
		else
			System.out.println("false");
		
		in.close();
	}
}
