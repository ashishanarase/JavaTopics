package extra_Concept;

public class NonStaticMethod {
	
	public void method1() {
		System.out.println("METHOD 01");
	}
	
	public void method2() {
		System.out.println("METHOD 02");
	}
	
	public static void main(String[] args) {
		NonStaticMethod object = new NonStaticMethod();
		object.method1();
		object.method2();		
	}

}
