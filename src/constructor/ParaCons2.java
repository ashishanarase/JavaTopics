package constructor;

public class ParaCons2 {
	String i = "GENERAL INFO ABOUT CONCRETE GRADE";

	ParaCons2(int a, int b, int c, char d){
		String m = "M";
		System.out.println(i);
		System.out.println(m + a + d +" 1 : 3 : 6");
		System.out.println(m + b + d +" 1 : 2 : 4");
		System.out.println(m + c + d +" 1 : 1.5 : 3");
	}
	public static void main (String [] args) {
		new ParaCons2(10,15,20,'=');
	}
}
