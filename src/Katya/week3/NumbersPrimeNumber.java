package Katya.week3;

/**
 * Numbers -- PrimeNumber
 * Write a method that can check if a number is prime or not
 */
public class NumbersPrimeNumber {

    // prime number is an integer number that can be divided for 1 or itself only

    public static boolean isPrimeNumber(int num) {

        if (num < 2) { // numbers are less than 2 ara not prime numbers
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

        for(int i = 0; i <= 100; i++){
            System.out.println(i + " is a prime number--> " + isPrimeNumber(i));
        }

    }
}
