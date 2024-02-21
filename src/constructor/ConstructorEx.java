package constructor;

public class ConstructorEx {
	boolean a;
	byte b;
	int c;

	ConstructorEx (){ //Constructor
		a = 54>30;
		b = 37;
		c = 150;
		System.out.println(b+c);
		System.out.println(a);
		System.out.println(b+c+c);
	}

	public static void main(String [] args) {
		new ConstructorEx(); //direct call
		}
} 
