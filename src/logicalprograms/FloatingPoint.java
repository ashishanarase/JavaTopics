package logicalprograms;

public class FloatingPoint {

	float a;						
	float b;

	FloatingPoint(float a, float b){
		System.out.println(a*b);
	}
	public static void main (String [] args) {
		new FloatingPoint(7.10f,5.25f);				//Input	
		//Ans=37.27
	}
}
