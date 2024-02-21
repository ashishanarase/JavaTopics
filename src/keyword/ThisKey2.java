package keyword;

public class ThisKey2 {

	int abc = 25; //global variable
	
	public void method02() { 
				
		int abc = 55; //local variable
		
		System.out.println(this.abc);
		
	}
	
	public static void main(String [] args) {
		ThisKey2 obj2 = new ThisKey2();
		obj2.method02();
	}

}
