package logicalprograms;

public class QuotientRemainder {
	
	int a = 77;						//Input
	int b = 199;					//Input
	
	public void nsm() {
		System.out.println(b/a);
		System.out.println(b%a); 
		
	}

	public static void main(String[] args) {
		QuotientRemainder obj = new QuotientRemainder();
		obj.nsm();	
		}
	}

