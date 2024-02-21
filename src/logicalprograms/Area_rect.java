package logicalprograms;

import java.util.Scanner;

public class Area_rect {
	
	public void nsm() {
		
		System.out.println("Enter length & width");
		double length;
		double width;

		Scanner input = new Scanner(System.in);
		length = input.nextDouble();
		width = input.nextDouble();
		
		System.out.println("Length =" + length);
		System.out.println("Width =" + width);
		
		double area = 2*length*width;
		
		System.out.println("Area = " + area);
		
	}

	public static void main(String[] args) {
		Area_rect object = new Area_rect();
		object.nsm();

	}

}
