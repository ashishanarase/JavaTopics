package stringprograms;

import java.util.Random;

public class RandomStringFetchFromArray {

	    public static void main(String[] args) {
	        // Declare an array of strings
	        String[] myArray = {"apple", "banana", "orange"};

	        // Fetch a random string from the array
	        Random random = new Random();
	        String randomString = myArray[random.nextInt(myArray.length)];

	        // Print the random string
	        System.out.println("Random string: " + randomString);
	    }
	}

