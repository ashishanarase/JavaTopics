package constructor;

public class ParaCons {
	ParaCons(String a){
		a = "Ashish Jayram Anarase.";
		System.out.println("Name=" + a);	
	}
	ParaCons(int b){
		b = 28;
		System.out.println("Age=" + b);
	}
	ParaCons(float c){
		c = 1.0f;
		System.out.println("This is my Parameterised Constructor Example " + c );		
	}
	public static void main(String[] args) {
		new ParaCons("name");
		new ParaCons(1000);
		new ParaCons(1.05f);
	}
}
