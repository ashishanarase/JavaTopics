package amar_sir;

import java.util.Scanner;

public class Static_Variable {

	static int abc;
	
	public static void main(String[] args) {
		System.out.println("Enter");
		
		Scanner input = new Scanner(System.in);
		abc = input.nextInt();
		System.out.println(abc);
	}
}
