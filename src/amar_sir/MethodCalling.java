package amar_sir;

public class MethodCalling {
	
	public void model(String a) {
		
		a = "VELOCITY CLASS MODEL";
		System.out.println(a);
	}
	public static void details(double b, float c, char d) {
		System.out.println("Timing= " + b + "PM To " + c + " PM (DAILY)");
		System.out.println("Faculty= Mr. AMAR SIR " + d + " Mr. Govind Sir.");
	}
	public static void main(String [] args) {
		MethodCalling obj = new MethodCalling();
		
		obj.model("a");
		
		obj.details(6.15d, 8.15f, '&');
	}
}


