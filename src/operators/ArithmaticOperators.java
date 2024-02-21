package operators;

public class ArithmaticOperators {
	public static void meth1() {
		int a = 65;
		int b= 35;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(" ");
	}
	public void meth2() {
		double c = 65.50;
		double d = 35.50;
		System.out.println(c+d);
		System.out.println(c-d);
		System.out.println(c*d);
		System.out.println(c/d);
		System.out.println(c%d);
	}
	public static void main(String[] args) {
		meth1();
		ArithmaticOperators obj = new ArithmaticOperators();
		obj.meth2();
	}

}
