package stringprograms;

public class OccuranceOfChar {

	public static void main(String[] args) {

		String s = "Ashish Anarase";

		char [] c = s.toCharArray();
		int count = 0;
		for (char ch : c) { 
			if ((ch=='A') || (ch=='a')) {
				count++;
			}
		}
		System.out.println("Given Charater Occurs = "+ count +" Times");
	}
}
