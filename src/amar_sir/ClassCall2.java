package amar_sir;

public class ClassCall2 {
	public static void details2() {
		String a = "Future Designation = Quality Analyst";
		System.out.println(a);
	}
	public void branch2() {
		String b = "Data Tester";
		System.out.println(b);
	}
	public static void main(String [] args) {
		ClassCall obj1 = new ClassCall();
		obj1.details();
		obj1.branch();
		details2();
		ClassCall2 obj = new ClassCall2();
		obj.branch2();
	}
}
