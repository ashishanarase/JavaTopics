package stringprograms;

public class FindDuplicates {
    public static void main(String[] args) {
        String str = "Ashish Anarase";
        int count;

        // Convert the string into lowercase to ignore case sensitivity
        str = str.toLowerCase();

        // Convert the string into an array of characters
        char[] chars = str.toCharArray();

        System.out.println("Duplicate characters in the string: ");

        // Iterate over each character in the array
        for (int i = 0; i < chars.length; i++) {
            count = 1;
            for (int j = i+1; j < chars.length; j++) {
                // If the characters match, increment count
                if (chars[i] == chars[j] && chars[i] != ' ') {
                    count++;
                    // Set the character at position j to 0 to mark it as counted
                    chars[j] = '0';
                }
            }
            // If count is greater than 1, we have a duplicate
            if (count > 1 && chars[i] != '0') {
                System.out.println(chars[i]);
            }
        }
    }
}
