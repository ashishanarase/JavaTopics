package logicalprograms;

import java.util.Scanner;

public class Parallelogram {

	public void nsm () {

		double base;
		double height;

		Scanner input = new Scanner(System.in);

		base =input.nextDouble();
		height =input.nextDouble();

		System.out.println("Base = " + base);
		System.out.println("Height = " + height);

		double area = base*height;		

		System.out.println("Area of Parallelogram = " + area);

	}

	public static void main(String[] args) {
		Parallelogram object = new Parallelogram();
		object.nsm();
	}

}

