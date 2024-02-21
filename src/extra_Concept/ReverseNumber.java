package extra_Concept;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
	int number = 123;
	int temp = number;
	int rem = 0;
	int store = 0;
	
	while (number>0) {
		rem = number%10;
		store = store*10+rem;
		number = number/10;		
	}
	if (temp==store) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not Palindrome");
	}
	
	}
}
