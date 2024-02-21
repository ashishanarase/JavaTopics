package amar_sir;

public class TypVariable {
	//static variable
	static float a = 150.550f;
	static long b = 9922220989L;
	//global variable
	float x = 200.600f;
	int y = 37;
	byte z = 111;
	String p = "enjoy";

	public void method1()
	{
		//locaL varialbe
		int c = 137;
		int d = 13;
		System.out.println(c+d+c);
		System.out.println(x+a+c);

	}
	public static void method2() {
		//local variable
		int e = 150;
		int f = 50;
		System.out.println(e+f+f);
		System.out.println(a+b);

	}

	//main method to call static and non static method.
	public static void main (String [] args) {
		method2();
		TypVariable obj= new TypVariable();
		obj.method1();
		System.out.println(obj.y* obj.z);
		System.out.println(obj.x);
		System.out.println(obj.p);
		
		

	}
}
