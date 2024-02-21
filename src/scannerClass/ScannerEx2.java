package scannerClass;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		byte a;
		short b;
		long c;
		float d;
	

		Scanner input = new Scanner(System.in);
		a=input.nextByte();
		b=input.nextShort();
		c=input.nextLong();
		d=input.nextFloat();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);		
	}
}
