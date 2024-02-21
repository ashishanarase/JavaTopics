package stringprograms;

public class ReverseStringFor {
	
	public static void main (String[] args) {
		
		String name = "Ashish";
		String rev = "";
		
		int i = name.length();
		
		for (int a=i-1;a>=0;a--) {
			rev=rev+name.charAt(a);
		}
		System.out.println(rev);
	}

}
