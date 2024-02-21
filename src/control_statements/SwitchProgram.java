package control_statements;

public class SwitchProgram {

	public static void main(String[] args) {
		//Type of Operators

		String a = "Relational Operations";		//Input
		switch (a) {

		case "Arithmetic Operations" : System.out.println(a+" = +,-,*,/ and %");break;
		case "Unary Operations" : System.out.println(a+" = a++,a--,++a and --a");break;
		case "Relational Operations" : System.out.println(a+" = <,>,<=,>=,== and !=");break;
		case "Bitwise Operations" : System.out.println(a+" = &, | and ^");break;
		case "Shift Operations" : System.out.println(a+" = << and >>");break;
		case "Ternary Operations" : System.out.println(a+" = variable and info");break;
		case "Assignment Operations" : System.out.println(a+" = +=, -=, *=,/=,%=,<=,>=,==,!=,>>= and <<=");break;
		case "Logical Operations" : System.out.println(a+" = &&, || and !");break;
		
		default : System.out.println("INVALID INPUT");		
		}

	}

}
