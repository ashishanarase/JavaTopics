package keyword;

public class SuperKey extends ThisKey2{
	
	int abc = 50;
		
	public void method03() {
		
		System.out.println(super.abc);
		
		System.out.println(abc);		
	}	
	SuperKey (){
		int abc=75;
		System.out.println(abc);
		System.out.println(super.abc);
		System.out.println(this.abc);
	}
	public static void main(String [] args) {

		SuperKey child = new SuperKey();
		child.method03();
	}
}

