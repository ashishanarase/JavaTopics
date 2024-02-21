package loopstatements;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		System.out.println("Enter the Number");

		int abc;
		Scanner input = new Scanner(System.in);
		abc = input.nextInt();
	
		switch (abc){
		case 1:System.out.println("Number is One (1)");break;
		case 2:System.out.println("Number is Two (2)");break;
		case 3:System.out.println("Number is Three (3)");break;
		case 4:System.out.println("Number is Four (4)");break;
		case 5:System.out.println("Number is Five (5)");break;
		default:System.out.println("Number is Greter than Five (5)");
		}
		
	}
}
