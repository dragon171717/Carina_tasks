package Marie;

public class Numbers_Reverse_Negative_Number {
    public static int reverseDigits(int num) {
        boolean isNegative = false;

        if (num < 0) {
            isNegative = true;
            num *= -1; // Make the num positive
        }

        int reversedNumber = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        return isNegative ? -reversedNumber : reversedNumber;
    }

    public static void main(String[] args) {
        int originalNumber = -53;
        int reversedNumber = reverseDigits(originalNumber);
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);
    }
}
