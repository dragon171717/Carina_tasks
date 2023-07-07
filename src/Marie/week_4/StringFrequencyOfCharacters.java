package Marie.week_4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *   String - Frequency of Characters
 * Write a return method that can find the frequency of characters
 *   Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
public class StringFrequencyOfCharacters {

    public static void main(String[] args) {
        String input = "Hello, world!";
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Iterating over each character in the input string
        for (char c : input.toCharArray()) {
            // Ignoring non-alphabetic characters
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c); // Converting to lowercase for case-insensitive counting
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        // Printing the frequency of each character
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
