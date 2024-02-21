package logical_InterviewBased;

public class DigitCount {

	public static void main(String[] args) {
		int num = 992222;
		int a;
		for (a=0;num>0;a++) {

			num=num/10;
		}	
		String numb = "Haramkhor";
		int length = numb.length();
		System.out.println(length);
		System.out.println("Number of digits in given number = " +a);
	}

}
