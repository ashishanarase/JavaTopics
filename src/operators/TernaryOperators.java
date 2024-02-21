package operators;

public class TernaryOperators {
	
	public void nsmethod () {
		int a = 40;
		a = a>30? 40 : 100;
		
		System.out.println(a);
		
		//bhangar ahe he 
	}

	public static void main(String[] args) {
		TernaryOperators obj = new TernaryOperators();
		obj.nsmethod();

	}

}
