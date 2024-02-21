package scannerClass;

public class MathClassEx2 {

		static double a = 20.30;
		static double b = 50;

		public void methodEx1 () {

			System.out.println("Round figure of a is " + Math.round(a));
		}
		public static void methodEx2 () {
			System.out.println("Power of b is " + Math.pow(b, 2));

		}
		public static void main(String []args) {
			MathClassEx2 object = new MathClassEx2();
			object.methodEx1();

			methodEx2();

		}
	}

