package extra_Concept;

public class Non_Static_Block {
	
	{
		System.out.println("This is my Non-Static Block");
	}
	
	Non_Static_Block(){
		System.out.println("This is my Constructor");
	}
	
	public static void main(String[] args) {
		Non_Static_Block object = new Non_Static_Block();
		System.out.println("This is my Main Method");
		
	}

}
