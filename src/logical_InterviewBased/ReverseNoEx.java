package logical_InterviewBased;

public class ReverseNoEx {
	
	public static void meth1() {
		int n = 123;
		int rem = 0;
		int store = 0;
		
		while (n>0) {
			rem = n%10;
			n = n/10;
			store=(store*10)+rem;
			}
		System.out.println(store);
	
	}	

	public static void main(String[] args) {
		meth1();
		int remainder;
		int num = 12345;						//Input

		for (int a=0;num!=0;a++) {

			remainder=num%10;
			num=num/10;
			System.out.print(remainder);
		}

	}
}





