package Katya;

public class Finra {
    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            String result = (i % 3 == 0 && i % 5 == 0) ? "FINRA" : (i % 3 == 0) ? "FIN" : (i % 5 == 0) ? "RA" : "" + i;
            System.out.print(result + " ");
        }
    }
}

/*
 FINRA:
Write a function which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */