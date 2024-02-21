package logicalprograms;

public class PrimeNumber {


	public static void main (String []args) {
	
		int num = 15;
		boolean isPrime = true;

		for(int i=2;i<num/2;i++) {
			if (num%i==0)
			{
				isPrime= false;
				break;
			}

		}
		if(isPrime) {
			System.out.println("The number is Prime Number");

		}
		else {
			System.out.println("The number is Not a Prime Number");
		}
	}
}