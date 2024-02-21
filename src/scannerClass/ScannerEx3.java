package scannerClass;

import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String[] args) {

		char a;
		double b;

		Scanner input = new Scanner(System.in);

		a=input.next().charAt(0);
		b=input.nextDouble();

		System.out.println(a);

		System.out.println(b);

	}

}
