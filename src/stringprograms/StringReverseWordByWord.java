package stringprograms;

public class StringReverseWordByWord {

	public static void main(String[] args) {
		String input = "I am QA Engineer";
		String output = reverseWords(input);
		System.out.println("Input: " + input);
		System.out.println("Output: " + output);
	}

	public static String reverseWords(String input) {
		// Split the input string into words using space as a delimiter
		String[] words = input.split(" ");

		// Create a StringBuilder to build the reversed string
		StringBuilder reversed = new StringBuilder();

		// Iterate through the words in reverse order and append to the StringBuilder
		for (int i = words.length - 1; i >= 0; i--) {
			reversed.append(words[i]);
			// Add a space unless it's the last word
			if (i > 0) {
				reversed.append(" ");
			}
		}

		// Convert the StringBuilder to a string
		return reversed.toString();
	}
}

