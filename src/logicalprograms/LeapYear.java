package logicalprograms;

public class LeapYear {

	int a = 2020;		//Input

	public void nsm() {
		if (a%4==0) {
			System.out.println(a + " IS LEAP YEAR");			
		}
		else {
			System.out.println(a +" IS NOT LEAP YEAR");
		}
	}			

	public static void main(String [] args) {
		LeapYear obj =new LeapYear();
		obj.nsm();

	}
}

// 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, and 2048.