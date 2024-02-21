package logical_InterviewBased;

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {

		System.out.println("Enter Number here");
	//int n;
	int m = 1;
	int o;			//Input

	Scanner input = new Scanner(System.in);
	
	o=input.nextInt();
	
	System.out.println("Factorial of = " + o);

	for(o=o;o>0;o--) {			
		m = m*o;
	}
	System.out.println(m);
}
}



