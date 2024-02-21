package scannerClass;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {

		int a;
		for (a=1;a<=10;a++)
		{
			for(int b=1;b<=10;b++)
			{
				int c;
				c = a*b;
				Scanner obj = new Scanner(System.in);
				
				c=obj.nextInt();
				System.out.print(c);

			}
				System.out.println();
		}
	}
}

	

