package sucharita.week_8;

import java.util.Arrays;

/**
 *   Array_MoveZerosToTheEnd
 * Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
 * input:  {1,0,2,0,3,0,4,0};
 * output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
public class Array_MoveZerosToTheEnd {

    public static int[] moveZerosToEnd(int[] array){
        int[] result= new int[array.length];
        int j=0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0){
                result[j++]=array[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array={1,0,2,0,3,0,4,0};
        System.out.println(Arrays.toString(moveZerosToEnd(array)));
    }



}

/* public static void main(String[] args) {

        int[] array = {1,0,2,0,3,0,4,0};

        int[] result = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] != 0 ) {
                result[j++] = array[i];
            }

        }

        System.out.println(Arrays.toString(result));




    }

    */
