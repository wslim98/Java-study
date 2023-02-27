package chap03;

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("철수: ");
		String a = in.next();
		
		System.out.print("영희: ");
		String b = in.next();
		
		if (a.equals("s")&&b.equals("s") || a.equals("r")&&b.equals("r") || a.equals("p")&&b.equals("p"))
			System.out.println("비겼습니다");
		else if (a.equals("s")&&b.equals("p") || a.equals("r")&&b.equals("s") || a.equals("p")&&b.equals("r"))
			System.out.println("철수, 승!");
		else
			System.out.println("영희, 승!");
		in.close();
	}

}
