package logical_InterviewBased;

public class OccuranceOfCharacterInString {

	public static void main(String[] args) {

		String s = "Ashish Anarase";
		char [] c=s.toCharArray();
		int count = 0;
		for (char ch :c) {
			if((ch=='A') || (ch=='a')){
				count++;
			}
		}
		System.out.println(count);
	}
}
