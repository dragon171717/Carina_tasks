package marat.week08;

import java.util.Arrays;

/**
 * Array_MoveZerosToTheEnd
 * Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
 * input:  {1,0,2,0,3,0,4,0};
 * output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
public class Array_MoveZerosToTheEnd {
    public static int[] moveZeros(int[] input) {
        int[] result = new int[input.length];
        int index = 0;
        for (int each : input) {
            if (each != 0) {
                result[index] = each;
                index++;
            }
        }
        return result;
    }
}
