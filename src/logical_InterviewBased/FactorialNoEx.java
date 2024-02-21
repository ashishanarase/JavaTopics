package logical_InterviewBased;

import java.util.Scanner;

public class FactorialNoEx {

	public static void main(String[] args) {
		System.out.println("Enter Number here");
		Scanner input = new Scanner(System.in);
		int num = 5;
		int factorial = 1;
		
		while (num>=1) {
			
			factorial=factorial*num;
			num=num-1;
		}		
		System.out.println("Factorial for the given number = " +factorial);
	}
}
