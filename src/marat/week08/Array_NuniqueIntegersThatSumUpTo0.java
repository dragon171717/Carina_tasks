package marat.week08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Array_NuniqueIntegersThatSumUpTo0
 * Write a function that, given an integer N (1 < N < 100),
 * returns an array containing N unique integers that sum up to 0.
 * The function can return any such array. For example, given N = 4,
 * the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
 * The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
 * For N = 3 one of the possible answers is [-1,0,1]
 * (but there are many more correct answers).
 */
public class Array_NuniqueIntegersThatSumUpTo0 {
    public static int[] intArraySumToZero(int n) {
        int[] result = new int[n];
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        int sum = 0;
        do {
            int int_random = rand.nextInt(n);
            if (!list.contains(int_random)) {
                list.add(int_random);
            }
        } while (list.size() != n - 1);
        for (Integer each : list) {
            sum += each;
        }
        list.add(-sum);
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intArraySumToZero(4)));
    }
}
