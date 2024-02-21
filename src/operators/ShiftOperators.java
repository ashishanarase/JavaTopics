package operators;

public class ShiftOperators {

	public static void main(String[] args) {

		int d=10;						//Left Shift Operator
		System.out.println(d<<2);		//10X2^2=40
		System.out.println(d<<3);		//10X2^3=80
		System.out.println(d<<4);		//10X2^4=160

		int b=20;						//Right Shift Operator
		System.out.println(b>>2);		//10/2^2=5
		System.out.println(b>>3);		//10/2^3=2.5
		System.out.println(b>>4);		//10/2^4=1.25
	}
}