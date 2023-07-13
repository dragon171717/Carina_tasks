package sucharita.week_7;
/*
  Array_FindMinimum
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
 */
public class Array_FindMinimum {

    public static void main(String[] args) {

        /*int[] arr={99, 12, 23, 32, 44, 57, 6};

        int max=arr[0];

        for (int i = 1; i < arr.length; i++) {

            if(arr[i]>max){
                arr[i]=max;
            }
        }
        System.out.println(max);

         */
        int[] arr={99, 12, 23, 32, 44, 57, 6,1000};
        System.out.println(minNum(arr));

        int[] arr1={};
        System.out.println(minNum(arr1));




    }


    public static int minNum(int[] arr){
        if(arr.length==0){
            System.out.println("arr is empty");
            return -1;
        }
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
