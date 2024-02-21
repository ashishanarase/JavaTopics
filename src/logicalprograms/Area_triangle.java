package logicalprograms;

import java.util.Scanner;

public class Area_triangle {
	
	public void nsm () {

		double base;
		double height;
		
		Scanner input = new Scanner(System.in);
		
		base =input.nextDouble();
		height =input.nextDouble();
		
		System.out.println("Base = " + base);
		System.out.println("Height = " + height);
		
		double area = 0.5*base*height;		

		System.out.println("Area of triangle = " + area);

		}

	public static void main(String[] args) {
		Area_triangle object = new Area_triangle();
		object.nsm();
	}

}
