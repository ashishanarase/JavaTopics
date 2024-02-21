package logical_InterviewBased;

public class PallindromeNoEx {

	public static void main(String [] args) {
		int num = 12321;
		int store = num;
		int rev = 0; 
		int rem;

		while (store!=0) {

			rem = store%10;				
			rev = rev*10+rem;			
			store = store/10;			
		}

		if (num==rev) {
			System.out.println("The given number " + num + " is a Pallidrom Number " );
		}
		else
		{
			System.out.println("The given number " + num + " is a Non-Pallidrom Number " );
		}
	}
}