package logicalprograms;

public class GradeAssignment {
	int a = 99;										//Input

	public void distribution() {

		if (a>=80 && a<=100){
			System.out.println("DISTINCTION");
		}
		else if (a>=65 && a<=79){
			System.out.println("FIRST CLASS");	
		}
		else if (a>=50 && a<=64) {
			System.out.println("SECOND CLASS");
		}
		else if(a>=35 && a<=49) {
			System.out.println("THIRD CLASS");
		}
		else if (a<=34 && a==0){
			System.out.println("FAIL");
		}
		else {
			System.out.println("INVALID INPUT");
		}
	}

	public static void main (String [] args) {
		GradeAssignment obj = new GradeAssignment ();
		obj.distribution();
	}
}
