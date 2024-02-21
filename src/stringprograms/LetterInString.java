package stringprograms;


public class LetterInString {

	    public static void main(String[] args) {
	        String str = "This is";
	        int count = 0;
	        
	        for(int i = 0; i < str.length(); i++) {
	            if(Character.isLetter(str.charAt(i))) {
	                count++;
	            }
	        }
	        
	        System.out.println("The number of letters in the string is: " + count);
	    }
	}
