package logical_InterviewBased;

public class PrimeNumb2 {

	public static void main(String[] args) {

		int no = 17;
		int temp =0;

		for (int i=2; i<=no-1;i++) {
			if (no%i==0) {
				temp=temp+1;
			}
		}
		if (temp>0) {
			System.out.println("The number is not a Prime Number");
		}
		else {
			System.out.println("The number is Prime Number");
		}
	}
}

