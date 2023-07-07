package Marie.week_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }


    }

    public static class DivisionWithoutOperator {

        public static double Division(){

            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter number you want to be numerator");
            double numerator = scan.nextDouble();
            scan.nextLine();
            int zeroPoint = 1;
            if (numerator == 0){
                return 0;
            }
            if (numerator < 0 ) {
                zeroPoint *= -1;
                numerator *= zeroPoint;
            }

            System.out.println("Please Enter number you want to be a denominator");
            double denominator = scan.nextDouble();
            scan.nextLine();
            if (denominator == 0) {
                throw new ArithmeticException ("you can`t divide numbers using 0 as denominator");
            }
            if (denominator < 0 ) {
                zeroPoint *= -1;
                denominator *= zeroPoint;
            }

            return  (zeroPoint * Division(numerator, denominator));
        }

        public static double Division(double numerator, double denominator){

            int i = 0;
            while (numerator >= denominator) {

                numerator -= denominator;
                ++i;
            }
            return ((double) i);
        }



        // scan.close();
        public static void main(String[] args) {
            try {
                System.out.println("Results of the division are: " + Division());
            }
            catch (InputMismatchException e) {
                System.out.println("Please use numbers only!");
            }
        }

    }
}

/*
 Numbers-  Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"

 */