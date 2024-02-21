package logical_InterviewBased;

public class Alphabet {
	//Java Program to Check Whether a Character is Alphabet or Not
	char a = '*';			//Input

	public void nsm() {
		if ((a>='a' && a<='z') || (a>='A' && a<='Z')) {
			System.out.println(a + " IS ALPHABET");			
		}
		else {
			System.out.println(a +" IS NOT ALPHABET");
		}
	}
	public static void main(String [] args) {
		Alphabet obj =new Alphabet();
		obj.nsm();
	}
}
