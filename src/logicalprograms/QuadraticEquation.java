package logicalprograms;

public class QuadraticEquation {
	//Java Program to Find all Roots of a Quadratic Equation
	//ax^2+bx+c=0
	// For example, the roots of the quadratic equation 
	//(x2 - 7x + 10 = 0 are x = 2 and x = 5) because they satisfy the equation. i.e.,
	//when x = 2, 22 - 7(2) + 10 = 4 - 14 + 10 = 0.
	//when x = 5, 52 - 7(5) + 10 = 25 - 35 + 10 = 0.	
	public void roots(double a, double b, double c) {
		double d;
		double r1, r2;
		d=b*b-(4*a*c);
		if (d>0)
		{
			System.out.println("Roots are real and Different");
			r1=(-b+Math.sqrt(d))/2*a;
			r2=(-b-Math.sqrt(d)/2*a);

			System.out.println("R1 : "+r1);
			System.out.println("R2 : "+r2);
		}
		else if (d==0) {
			System.out.println("Roots are real and Different");
			r1=r2=b/2*a;
			System.out.println("R1 : "+r1);
			System.out.println("R2 : "+r2);
		}
		else
		{
			System.out.println("Roots are not real");
		}
	}


	public static void main(String[] args) {
		QuadraticEquation obj = new QuadraticEquation();
		obj.roots(1.0,-7.0,10.0);
		obj.roots(1.0,-7.0,10.0);
		obj.roots(1.0,-7.0,10.0);

	}

}
