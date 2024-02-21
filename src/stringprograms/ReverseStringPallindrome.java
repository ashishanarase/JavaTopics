package stringprograms;

public class ReverseStringPallindrome {

	public static void main (String [] args) {

		String n0 = "LEVEL";
		
		StringBuilder n2 = new StringBuilder (n0);
		
		StringBuilder rev = n2.reverse();
		
		String n3 = rev.toString();
		
		if (n0.equals(n3)) {
			System.out.println("String Is Pallindrom");
		}
		else {
			System.out.println("String Is Not Pallindrom");
		}
	}
}
