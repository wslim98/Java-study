package chap03;

import java.util.Scanner;

public class q7 {

	public static void main(String[] args) {
		
		String person1 = person("철수");
		String person2 = person("영희");
		match(person1, person2);
	}
	
	// person method
	public static String person(String name) {
		Scanner in = new Scanner(System.in);
		System.out.printf("%s: ", name);
		String pick = in.next();
		
		
		return pick;
	}
	
	// match method
	public static void match(String a, String b) {
		if (a.equals("s")&&b.equals("s") || a.equals("r")&&b.equals("r") || a.equals("p")&&b.equals("p"))
			System.out.println("비겼습니다");
		else if (a.equals("s")&&b.equals("p") || a.equals("r")&&b.equals("s") || a.equals("p")&&b.equals("r"))
			System.out.println("철수, 승!");
		else
			System.out.println("영희, 승!");
	}
}
