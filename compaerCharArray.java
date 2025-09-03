package String_Level1;

import java.util.Scanner;
public class compaerCharArray {
	

	    // Method to return characters in a string without using toCharArray()
	    public static char[] getCharsCustom(String str) {
	        char[] chars = new char[str.length()];
	        for (int i = 0; i < str.length(); i++) {
	            chars[i] = str.charAt(i);
	        }
	        return chars;
	    }

	    // Method to compare two char arrays
	    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
	        if (arr1.length != arr2.length) {
	            return false;
	        }
	        for (int i = 0; i < arr1.length; i++) {
	            if (arr1[i] != arr2[i]) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the string:");
	        String inputString = scanner.next();

	        // Use user-defined method to get char array
	        char[] customCharArray = getCharsCustom(inputString);

	        // Use built-in toCharArray method
	        char[] builtInCharArray = inputString.toCharArray();

	        // Compare both arrays
	        boolean arraysEqual = compareCharArrays(customCharArray, builtInCharArray);

	        // Display results
	        System.out.println("Characters from custom method: ");
	        for (char c : customCharArray) {
	            System.out.print(c + " ");
	        }
	        System.out.println();

	        System.out.println("Characters from built-in toCharArray(): ");
	        for (char c : builtInCharArray) {
	            System.out.print(c + " ");
	        }
	        System.out.println();

	        System.out.println("Are both character arrays equal? " + arraysEqual);

	        scanner.close();
	    }
	}


}
