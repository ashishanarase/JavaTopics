package operators;

public class ConditionalOperators {
	//It is also known as Relational Operators

	public static void main(String [] args) {
		int LXI = 589948;
		int VXI = 673948;
		int VXIAMT = 723948;
		int ZXI =  741948;
		int ZXIAMT = 791948;
		int ZXIPLUS = 812948;
		int ZXIPLUSAMT =  862948;

		System.out.println(ZXIPLUSAMT>LXI);
		System.out.println(ZXI>ZXIAMT);
		System.out.println(ZXI<=VXI);
		System.out.println(ZXIPLUS>=ZXIPLUSAMT);
		System.out.println(VXIAMT==ZXIPLUSAMT);
		System.out.println(ZXIPLUSAMT>ZXI);
		System.out.println(ZXIPLUSAMT!=ZXIPLUS);
	}

}
