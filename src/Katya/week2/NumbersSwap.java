package Katya.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *  Numbers -- Swap Numbers
 * Swap two variable values without using a third variable
 */
public class NumbersSwap {
    public static void main(String[] args) {

        ArrayList<Integer> swapNumbers = new ArrayList<>(Arrays.asList(4, 6));
        System.out.println(swapNumbers);

        Collections.swap(swapNumbers,0,1);
        System.out.println(swapNumbers);



    }
}
