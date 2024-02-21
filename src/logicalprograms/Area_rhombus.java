package logicalprograms;

import java.util.Scanner;

public class Area_rhombus {

	public void nsm() {
		
		double diagonal1;
		double diagonal2;
		
		Scanner input = new Scanner(System.in);
		
		diagonal1 =input.nextDouble();
		diagonal2 =input.nextDouble();
		
		System.out.println("First Diagonal = " + diagonal1);
		System.out.println("Second Diagonal = " + diagonal2);
		
		double area = 0.5*diagonal1*diagonal2;
		
		System.out.println("Area = " + area);	
		
	}
	
	public static void main(String[] args) {
		Area_rhombus object = new Area_rhombus();
		object.nsm();
		
	}
}
