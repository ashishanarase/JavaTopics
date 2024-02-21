package logicalprograms;

import java.util.Scanner;

public class Average {

	public void methodex () {

		System.out.println("Input any 5 Numbers");

		double a;
		double b;
		double c;
		double d;
		double e;

		Scanner input = new Scanner(System.in);

		a =input.nextDouble();
		b =input.nextDouble();
		c =input.nextDouble();
		d =input.nextDouble();
		e =input.nextDouble();

		double f = (a+b+c+d+e)/5;

		System.out.println("The average of 5 given numbers is " + f);
	}
	public static void main(String []args) {
		Average obj = new Average();
		obj.methodex();
	}

}
