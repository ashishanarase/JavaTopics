package constructor;

public class ConstuEx {
	
	ConstuEx (int a){
		//a=10;
		System.out.println(a);
	}
	
	ConstuEx (int b, int c){
		b=35;
		c=125;
		System.out.println(b);
		System.out.println(c);
	}
	
	
	
	public static void main(String[] args) {
		new ConstuEx(20);
		 new ConstuEx(20, 124);
		
		
	}
}
