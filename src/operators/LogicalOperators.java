package operators;

public class LogicalOperators {
	public static void main(String[] args) {
		System.out.println((20<22)&&(66<55));			
		//T && F = F
		System.out.println((20<22)||(66<55));	
		//T || F = T
		System.out.println((20<22)||(66>55));	
		//T && T = T 
		System.out.println((22<20)||(66<55));	
		//F || F = F
		
	}
		
}
