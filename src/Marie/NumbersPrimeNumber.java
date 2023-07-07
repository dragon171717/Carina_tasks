package Marie;

import java.util.Scanner;

/**
 *  Numbers -- PrimeNumber
 * Write a method that can check if a number is prime or not
 */
public class NumbersPrimeNumber {
    public static boolean isPrime(int num){
        if(num <=1 ){
            return false;
        }


        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Please enter an integer number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

}
