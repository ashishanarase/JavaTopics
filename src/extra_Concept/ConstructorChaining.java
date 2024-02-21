package extra_Concept;

public class ConstructorChaining {

	ConstructorChaining() {
		this(10);
		System.out.println("1st");
	}
	ConstructorChaining(int a){
		this(5,20);
		System.out.println(a);
	}		
	ConstructorChaining(int a, int b){

		System.out.println(a+b);
	}	
	public static void main(String[] args) {
		ConstructorChaining obj = new ConstructorChaining();
	}	
}




