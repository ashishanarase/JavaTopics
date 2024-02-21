package amar_sir;

public class ClassCall {
	public static void details() {
		String a = "NAME-ASHISH JAYRAM ANARASE";
		System.out.println(a);
	}
	public void branch() {
		String b = "Design Engineer";
		System.out.println(b);
	}
	public static void main(String [] args) {
		details();
		ClassCall obj = new ClassCall();
		obj.branch();
	}
}
