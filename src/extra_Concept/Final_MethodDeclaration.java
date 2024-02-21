package extra_Concept;

public class Final_MethodDeclaration {
	
	public static final void method01 () {
		System.out.println("This is static method declared with final keyword");
	}
	
	public final void method02 () {
		System.out.println("This is non-static method declared with final keyword");
	}
	
	public static final void main(String[] args) {		
		System.out.println("This is main method declared with final keyword");
		
		Final_MethodDeclaration obj = new Final_MethodDeclaration();
		method01();
		obj.method02();		
	}
}
