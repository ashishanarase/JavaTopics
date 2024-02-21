package logical_InterviewBased;

public class Reverse {

	public static void main(String[] args) {

		int num = 1234;
		int mod = 0;
		int temp;

		while (num!=0) {
			temp = num%10;		//temp = 1234/10 =4
			mod = mod*10+temp;	//mod = 0*10+4 = 4
			num = num/10;		//num = 1234/10 =123
		}
		System.out.println(mod);
		//1234/10=123			4
		//123/10=12				3
		//12/10=1				2
		//1/10=1				1
	}
}
