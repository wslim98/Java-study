package chap03;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("나이 입력: ");
		int age = in.nextInt();
		
		if(age>=19)
			System.out.println("성년");
		else
			System.out.println("미성년");
		
		in.close();
	}
}
