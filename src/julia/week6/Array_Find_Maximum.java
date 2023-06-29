package julia.week6;

public class Array_Find_Maximum {

    /*
    Write a method that can find the maximum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
     */

    public static int maxNumber(int [] number) {

        int max = Integer.MIN_VALUE;

        for (int each : number) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }



    public static int minNumber(int[] number){

        int min = Integer.MAX_VALUE;

        for (int each : number) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }



    public static void main(String[] args) {

        int[] newArray = {75,34,89,22,12,0,-100};
        System.out.println("maxNumber(newArray) = " + maxNumber(newArray));
        System.out.println("minNumber(newArray) = " + minNumber(newArray));


    }



}
