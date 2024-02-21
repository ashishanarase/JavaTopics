package logical_InterviewBased;

public class LetterInString_Ex {

	public static void main (String [] args ) {
	String num = "Ashish Anarase";
	int b = 0;
	int c = num.length();
	System.out.println(c);
	for (int a=0; a< num.length();a++) {
		if (num.charAt(a)!=' ')
		b++;
	}	
	System.out.println(b);
	}
	
}