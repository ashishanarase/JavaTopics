package logicalprograms;

public class SumofNaturalNo {

	public void myMethod() {

		int a = 10;				//Input
		int b = 22;			//Input
		int c = a+b;
		if (a<=0) {
			System.out.println(a +" is not a Natural Number");
		}
		else if (b<=0) {
			System.out.println(b +" is not a Natural Number");
		}

		else {
			System.out.println("Sum of given two Natural Numbers = " +c);
		}
	}


	public static void main(String[]args) {
		SumofNaturalNo obj = new SumofNaturalNo();
		obj.myMethod();
	}
}


//1. Java Program to Calculate the Sum of Natural Numbers