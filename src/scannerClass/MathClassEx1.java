package scannerClass;

public class MathClassEx1 {
	static double a = 20;
	static double b = 50;

	public void methodEx1 () {

		System.out.println("Maximum number in between a & b is " + Math.max(a, b));
	}
	public static void methodEx2 () {
		System.out.println("Minimum number in between a & b is " + Math.min(a, b));

	}
	public static void main(String []args) {
		MathClassEx1 object = new MathClassEx1();
		object.methodEx1();

		methodEx2();

	}
}
