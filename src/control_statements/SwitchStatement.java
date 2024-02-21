package control_statements;

public class SwitchStatement {
	//The code displays the name of the day, 
	//based on the value of the day, using the switch statement.

	static int a = 2; 			//Input

	public static void myMethod() {
		switch (a) {
		case 1 : System.out.println("TODAY IS MONDAY");break;
		case 2 : System.out.println("TODAY IS TUEDAY");break;
		case 3 : System.out.println("TODAY IS WEDNESDAY");break;
		case 4 : System.out.println("TODAY IS THURDAY");break;
		case 5 : System.out.println("TODAY IS FRIDAY");break;
		case 6 : System.out.println("TODAY IS SATURDAY");break;
		case 7 : System.out.println("TODAY IS SUNDAY");break;
		default : System.out.println("INVALID OUTPUT");
		}
	}
	public static void main(String [] args) {
		myMethod();
	}
}

//1. Write java program where declares an int or string named day whose value represents a day(1-7) 
//or Monday to Sunday. The code displays the name of the day, 
//based on the value of the day, using the switch statement.
//2. Program to check Vowel or Consonant using switch statement
//3. Write java program with nested if else statement
//4. Write java program with switch statement