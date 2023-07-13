package sucharita.week_7;

import java.util.Arrays;

/*
  Array_SortAscending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */
public class Array_SortAscending {
    public static void main(String[] args) {
        int[] arr = {-2, 10, 9, 8, 7, -3, 0};
        sortAscending(arr);
        System.out.println(Arrays.toString(arr));

    }
        public static int[] sortAscending(int[] arr){
        if(arr.length<=1){
            System.exit(1);
        }

        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];

                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
       return arr;

    }
}
