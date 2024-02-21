package logicalprograms;

import java.util.Scanner;


public class Area_circle {

	public void nsm () {
		
		System.out.println("Enter radius");

		double radius;
	
		Scanner input = new Scanner(System.in);

		radius =input.nextDouble();
		System.out.println("Radius = " + radius);

		double area = Math.PI*radius*radius;		

		System.out.println("Area of Circle = " + area);

	}
	public static void main(String[] args) {
		Area_circle object = new Area_circle();
		object.nsm();
	}

}
