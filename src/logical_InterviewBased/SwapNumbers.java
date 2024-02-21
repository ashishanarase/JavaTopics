package logical_InterviewBased;

public class SwapNumbers {

	int a = 22;			//Input	
	int b = 77;			//Input		
	//swap two numbers with out using third variable	
	public void nsm() {
		
		a = a+b;		//22+77 a=99	
		b = a-b;		//99-77=22 a=22
		a = a-b;		//99-22=77 b=77
				
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	public static void main(String [] args) {
		SwapNumbers obj = new SwapNumbers();
		obj.nsm();
	}
	
}
