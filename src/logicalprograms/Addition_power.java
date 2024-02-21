package logicalprograms;

import java.util.Scanner;

public class Addition_power {

	public static void main(String[] args) {

		System.out.println("Enter two number");
		
		double a;
		double b;
		
		Scanner input = new Scanner(System.in);
		a=input.nextDouble();
		b=input.nextDouble();
		
		double c = a+b;
		
		System.out.println("The addition of two given numbers is " +c);
		
		double power = Math.pow(a, 2);
		double power1 = Math.pow(b, 2);
		
		System.out.println(power);
		System.out.println(power1);
		

	}
}