package operators;

public class AssignmentOperators {

	public void method1() {
		int x = 5;
		int y = 10;
		System.out.println(x<=y);	//True
		System.out.println(x>=y);	//False
		System.out.println(x==y);	//False
		System.out.println(x!=y);	//True
		
		System.out.println(x<<=y);	//5120
		System.out.println(x);		//5120
		System.out.println(x>>=y);	//5
		System.out.println(x);		//5
		
		System.out.println(x&=30);	//4
		System.out.println(y&=30);  //2
		System.out.println(y|=20);
		
		System.out.println(x|=20);	//20
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a+=b);		//10+20=30, a=30
		System.out.println(a++);		//30+1=31,  a=31 p-30
		System.out.println(--a);		//31-1=30
		System.out.println(a-=b);		//30-20=10
		System.out.println(a*=b);		//10X20=200
		System.out.println(a/=b);		//200/20=10
		System.out.println(b%a);		//20/10=2, %=0

		AssignmentOperators obj = new AssignmentOperators();
		obj.method1();
	}

}
