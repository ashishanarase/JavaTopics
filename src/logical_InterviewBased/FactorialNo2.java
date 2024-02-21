package logical_InterviewBased;

public class FactorialNo2 {

	//Find Factorial of a Number
	public static void main(String[] args) {

		
		int m = 1;
		int num = 7;			//Input

		for(int n=num;n>0;n--) {			
			m = m*n;
			//1=1*7
			//7=7*6   
			//42=42*5
			//210=210*4
			//840=840*3
			//2520=2520*2
			//5040=5040*1======5040(EUUUUUUUUUUUUUU)

		}
		System.out.println(m);
	}
}
