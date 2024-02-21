package logicalprograms;

public class LargestNumbers {
	//Java Program to Find the Largest Among Three Numbers
	int a = 2221;		//Input	
	int b = 9922;		//Input
	int c = 9952;		//Input

	public void nsm() {

		if (a>b && a>c) {
			System.out.println("THE LARGEST NUMBER AMONG THE " + a +", "+ b + " & " + c +" IS "+ a);
		}
		else if (b>c) {
			System.out.println("THE LARGEST NUMBER AMONG THE " + a +", "+ b + " & " + c +" IS "+ b);
		}
		else {
			System.out.println("THE LARGEST NUMBER AMONG THE " + a +", "+ b + " & " + c +" IS "+ c);
		}
	}

	public static void main(String[] args) {
		LargestNumbers obj = new LargestNumbers();
		obj.nsm();
	}

}
