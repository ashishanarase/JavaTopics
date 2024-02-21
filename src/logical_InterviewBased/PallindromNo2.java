package logical_InterviewBased;

import java.util.Scanner;

public class PallindromNo2 {
	public static void main(String[] args) {
		System.out.println("Enter number here");
		Scanner input = new Scanner(System.in);
		int num =input.nextInt();
		int temp = num;
		int rem = 0;
		int store = 0;

		while (num>0) {
			rem = num%10;
			num = num/10;
			store=(store*10)+rem;
		}
		if(temp==store) {
			System.out.println("Number is Pallindrome number");
		}
		else {
			System.out.println("Number is not a pallindrome number");
		}

	}

}
