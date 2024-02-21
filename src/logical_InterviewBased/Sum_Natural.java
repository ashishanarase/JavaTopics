package logical_InterviewBased;

import java.util.Scanner;

public class Sum_Natural {

	public static void main(String[] args) {
		System.out.println("Enter Number here");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int i = 1;
		int add = 0;

		while (i<=num) {

			add = add+i;
			i = i +1;
		}
		System.out.println(add);
	}
}
