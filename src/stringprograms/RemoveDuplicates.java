package stringprograms;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "hello world";
        String result = "";

        // Convert the string into lowercase to ignore case sensitivity
        str = str.toLowerCase();

        // Convert the string into an array of characters
        char[] chars = str.toCharArray();

        // Iterate over each character in the array
        for (int i = 0; i < chars.length; i++) {
            // If the character is not a duplicate, add it to the result string
            if (str.indexOf(chars[i]) == i) {
                result += chars[i];
            }
        }

        System.out.println("String with duplicates removed: " + result);
    }
}
