package logicalprograms;

import java.util.Arrays;

	public class StringSortingExample {
	    public static void main(String[] args) {
	        String[] strings = {"apple", "banana", "grape", "cherry", "date"};

	        System.out.println("Original array:");
	        for (String str : strings) {
	            System.out.println(str);
	        }

	        Arrays.sort(strings);

	        System.out.println("\nSorted array:");
	        for (String str : strings) {
	            System.out.println(str);
	        }
	    }
	}
