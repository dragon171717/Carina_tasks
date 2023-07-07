package Marie.week_4;

import java.util.Arrays;

/**
 *   String - Remove Duplicates
 * Write a return method that can remove the duplicated values from the String
 *   Ex: removeDup("AAABBBCCC") ==> ABC
 */
public class StringRemoveDuplicates {
    public static String removeDuplicates(String input) {
        // Create a StringBuilder to construct the resulting string
        StringBuilder result = new StringBuilder();

        // Iterate over each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Add the character to the result string if it is not already present
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }

        // Convert the StringBuilder to a string and return it
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String result = removeDuplicates(input);
        System.out.println(result);  // Output: Helo, Wrd!
    }
}
