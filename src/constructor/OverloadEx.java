package constructor;

public class OverloadEx {
	
	OverloadEx(){
		System.out.println("This is a Zero Argument Constructor");
	}
	OverloadEx(int abc){
		System.out.println("This is a overloaded with Argument Constructor");
	}
	public static void main(String[] args) {
		new OverloadEx();
		new OverloadEx(50);
	}

}
