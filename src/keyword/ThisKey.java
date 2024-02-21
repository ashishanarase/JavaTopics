package keyword;

public class ThisKey {
	//this keyword

	int abc = 25; //global variable

	public void method01() { //local variable

		//int abc = 10;

		this.abc=abc;

		System.out.println(abc);

	}

	public static void main(String [] args) {
		ThisKey obj = new ThisKey();
		obj.method01();
	}

}
