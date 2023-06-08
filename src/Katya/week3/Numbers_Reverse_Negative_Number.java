package Katya.week3;

import java.io.FilterOutputStream;

public class Numbers_Reverse_Negative_Number {
    /**
     * Write a return method that can reverse digits of a negative number and return it as int
     * input: -35  output: -53
     */

    public static int reverseDigitsOfNeg(int num) {

        if (num < 0) { // checking if number negative
            num = Math.abs(num); // will work with its absolute
        } else {
            System.out.println("this method for negative numbers only");
            System.exit(0);
        }
        String given = "" + num; // converting given parameter into string

        String reverse = ""; // new reversed string

        for (int i = given.length() - 1; i >= 0; i--) {
            reverse += given.charAt(i) + "";
        }
        return Integer.parseInt(reverse) * (-1); // multiplying by -1 to have negative result
    }

    public static void main(String[] args) {
        System.out.println(reverseDigitsOfNeg(-102));
    }
}




