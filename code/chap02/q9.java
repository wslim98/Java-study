package chap02;

import java.util.Scanner;

public class q9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("전공 이수 학점 : ");
		int a = in.nextInt();
		
		System.out.print("교양 이수 학점 : ");
		int b = in.nextInt();
		
		System.out.print("일반 이수 학점 : ");
		int c = in.nextInt();
		
		if(a+b+c>=140)
			if(a>=70)
				if((b>=30 && c>=30) || b+c>=80)
					System.out.print("졸업 가능");
				else
					System.out.print("졸업 불가");
			else
				System.out.print("졸업 불가");
		else
			System.out.print("졸업 불가");
		
		in.close();
	}
}
