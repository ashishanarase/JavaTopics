package scannerClass;

import java.util.Scanner;

public class ScannerEx1 {

	public void myMethod() {

		int a;
		Scanner object = new Scanner (System.in);
		a=object.nextInt();
		
		System.out.println(a);
		
		String b;
		Scanner object2 = new Scanner (System.in);
		b=object2.next();
		System.out.println(b);

		boolean c;
		Scanner input = new Scanner (System.in);
		int d; 
		int e;
		//boolean f= d>e;
		//c=input.nextBoolean();
	//	System.out.println(f);
	}
	
	public static void main(String[] args) {
		ScannerEx1 obj =new ScannerEx1();
		obj.myMethod();
	}

}
