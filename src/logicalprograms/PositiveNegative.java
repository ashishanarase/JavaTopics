package logicalprograms;

public class PositiveNegative {

	static int a = 37;				//Input 

	public static void main(String[] args) {		
		if (a>0) {
			System.out.println(a + " IS POSITIVE NUMBER");
		}
		else if (a<0){
			System.out.println(a + " IS NEGATIVE NUMBER");
		}
		else {
			System.out.println("INVAID INPUT");
		}
	}
}
