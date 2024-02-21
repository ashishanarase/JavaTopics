package control_statements;

public class Nested_ifelse {
	//3. Write java program with nested if else statement

	int h = 999; 			//Input

	public void myMethod() {
		
		if (h>0 && h<1000) {
			System.out.println("NUMBER IS GREATER THAN ZERO");
			if (h>1 && h<100) {
				System.out.println("BUT LESS THAN HUNDRED");
				if (h>101 && h<1000) {
					System.out.println("BUT LESS THAN THOUSAND");
				}
			}
		}
		else {
			System.out.println("NUMBER IS GREATER THAN THOUSAND");
		}
	}

	public static void main(String[] args) {
		Nested_ifelse obj = new Nested_ifelse();
		obj.myMethod();
	}

}
