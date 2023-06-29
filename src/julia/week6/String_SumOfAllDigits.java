package julia.week6;

public class String_SumOfAllDigits{

        /*
    Write a method that can return the sum of the digits in a string
    Ex:  "12 java 5 apple 3"  ==>  20
    */

    public static int sum_of_all_digits(String string){

        int sum = 0;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (Character.isDigit(ch)){
                int digit = Character.getNumericValue(ch);
                sum += digit;
            }
        }
        return sum;
    }

    public static int sum_of_all_digits2(String string){

        int sum = 0;
        char[] ch = string.toCharArray();

        for (char each : ch) {
            if (Character.isDigit(each)){
                sum += Integer.valueOf(""+each);
            }
        }
        return sum;
    }



    public static void main(String[] args) {

        String given = "9 text 9 text 9";
        int sumOfDigits = sum_of_all_digits2(given);
        System.out.println("Sum of all digits:" + sumOfDigits);
    }


}
