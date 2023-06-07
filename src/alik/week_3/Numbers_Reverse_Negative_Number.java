package alik.week_3;

public class Numbers_Reverse_Negative_Number {

    public static int reverse(int number) {
        if (number==0) {
            return 0;
        }

        String strNumber = String.valueOf(number);
        StringBuilder reversedStrNumber = new StringBuilder("-");
        for (int i = strNumber.length() - 1; i >= 0; i--) {
            reversedStrNumber.append(strNumber.charAt(i));
        }
        return Integer.parseInt(reversedStrNumber.toString());
    }

    public static void main(String[] args) {
        System.out.println(reverse(567));
    }

}
