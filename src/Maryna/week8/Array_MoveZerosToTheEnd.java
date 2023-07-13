package Maryna.week8;

import java.util.Arrays;

public class Array_MoveZerosToTheEnd {


//    1️⃣  Array_MoveZerosToTheEnd
//    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
//    input:  {1,0,2,0,3,0,4,0};
//    output: [1, 2, 3, 4, 0, 0, 0, 0]

        public static void main(String[] args) {

            int[] input={0, 2,5,0,9,0,2,0};
            System.out.println("Input array: "+ Arrays.toString(input));
            System.out.println("Result array: "+Arrays.toString(moveZeroesToEnd(input)));

        }

        private static int[] moveZeroesToEnd(int[] input) {

            int length = input.length, indexLeft = 0, indexRight = length - 1;
            int[] result = new int[length];

            for (int each : input) {
                //if current element 0 -- put it to the right part of result array
                if (each == 0) result[indexRight--] = each;
                    //if current element is not 0 -- put it to the left part of result array
                else result[indexLeft++] = each;
            }
            return result;
        }

    }

