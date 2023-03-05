package chap04;

class Printer {
	private int numOfPapers = 0;
	
	public Printer(int amount) {
		numOfPapers = amount;
	}
	
	public void print(int amount) {
		
		if (numOfPapers == 0) {
			System.out.println("용지가 없습니다.");
		}
		else if(numOfPapers<amount) {
			System.out.printf("모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.", amount-numOfPapers, numOfPapers);
			System.out.println();
			numOfPapers = 0;
		}
		else {
			numOfPapers -= amount;
			System.out.printf("%d장 출력했습니다. 현재 %d장 남아 있습니다.", amount, numOfPapers);
			System.out.println();
		}
	}
}

public class printcode {
	
	public static void main(String[] args) {
		// 	printer code test
		Printer myPrinter = new Printer(10);
		myPrinter.print(2);
		myPrinter.print(20);
		myPrinter.print(10);
	}

}
