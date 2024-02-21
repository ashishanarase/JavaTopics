package amar_sir;

public class DataTypes {
	public void nonstatic_Method() {
		//any statement which can be true or false
		boolean a = 15<25;
		System.out.println(a);
		boolean b = 14<9;
		System.out.println(b);

		//any value between -128 to 127 (i.e. 2^7) 8 bits
		byte c = 12*2;
		System.out.println(c);
		byte d = 11*10;
		System.out.println(d);

		//any value between -32768 to 32767 (i.e. 2^15) 16 bits
		short e = 150;
		System.out.println(e);
		short f = 199;
		System.out.println(f);

		//any value between -2147483648 to 2147483647 (i.e. 2^31) 32 bits
		int g = 22232323;
		System.out.println(g);
		int h = 35685106;
		System.out.println(h);

		//any value between -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (i.e. 2^63) 64 bits
		long i = 9922220989l;
		System.out.println(i);
		long j = 992222099222l;
		System.out.println(j);
		
		int k = 33;
		System.out.println(k);
		
		char m = 'A';
		System.out.println(m);
		
		double n = 15081947.16041993;
		System.out.println(n);
		
		float o = 9922.220989f;
		System.out.println(o);
		
		}
	public static void main (String [] args) {
		DataTypes variable = new DataTypes();
		variable.nonstatic_Method();
		
	}
}

//DATATYPE-BBSCILFD-11224848
//Boolean- 1 bit-True/Flase
//Byte-1byte-8bit-
//Short-2byte-16bit-
//Char-2byte-16bit-
//Int-4byte-32bit-
//Long-8byte-64bit-
//Float-4byte-32bit-
//Double-8byte-64bit-
