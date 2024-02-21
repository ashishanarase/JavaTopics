package logicalprograms;

public class CountNoInt {

	public static void main(String[] args) {

		int a;
		int num=12347;		//Input

		for(a=0;num>0;a++)  
		{
			num=num/10;

		}
		System.out.println("Number of digits in given integer = "+a);
	}

}


