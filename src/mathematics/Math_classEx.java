package mathematics;

public class Math_classEx {

	public static void mathematics() {

		int a = Math.min(100,500);			
		int c = Math.max(100,500);

		System.out.println(a);
		System.out.println(c);

		int b = 725;
		double root = Math.sqrt(b);
		double croot = Math.cbrt(b);
		
		double power = Math.pow(2, 2);

		System.out.println(root);
		System.out.println(croot);
		System.out.println(power);

	}

	public static void main(String[] args) {
		mathematics();


	}
}

