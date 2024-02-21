package logicalprograms;

public class OddEven {

	int a = 777;		//Any whole number can be divided by two
	
	public void nsm() {
	if (a%2==0) {
		System.out.println("THE NUMBER IS EVEN");
	}
	else {
		System.out.println("THE NUMBER IS ODD");
	}
	}	
		
	public static void main(String[] args) {
		OddEven obj = new OddEven();
		obj.nsm();
	}

}
