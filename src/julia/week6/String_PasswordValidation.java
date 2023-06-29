package julia.week6;

public class String_PasswordValidation {

    /*
    1. Write a return method that can verify if a password is valid or not.
    requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper-case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special character
    5. Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns  false
     */


    // return type is boolean since we need to verify whether the password is valid or not
    public static boolean password_validation(String password){

        String uppercase = "(.*[A-Z].*)",
                lowercase = "(.*[a-z].*)",
                specialCharacter = "(.*[!@#$%^&*()_+=|{}:;'<>,.?/].*)",
                digit = "(.*[0-9].*)";

        boolean hasUpper = password.matches(uppercase),
                hasLower = password.matches(lowercase),
                hasSpecialCharacter = password.matches(specialCharacter),
                hasDigit = password.matches(digit),
                validPassword = false;

        if (password.length() >= 6 && !password.contains(" ")){
            if (hasUpper && hasLower && hasSpecialCharacter && hasDigit){
                validPassword = true;
            }
        }
        return validPassword;

    }

    // another way to write the method would be to introduce separate conditions:
    public static boolean password_validation2(String password) {

        boolean validPassword = true;

        if (!password.matches(".*[A-Z].*")) {
            validPassword = false;
        }

        if (!password.matches(".*[a-z].*")) {
            validPassword = false;
        }

        if (!password.matches(".*[!@#$%^&*()_+=|{}:;'<>,.?/].*")) {
            validPassword = false;
        }

        if (!password.matches(".*[0-9].*")) {
            validPassword = false;
        }

        if (password.length() < 6 || password.contains(" ")){
            validPassword = false;
        }

        return validPassword;

    }


    public static void main(String[] args) {
        System.out.println("password_validation(\"Z*sa1zSa\") = " + password_validation("Z*sa1zSa"));
        System.out.println("password_validation(\"@Ca3t\") = " + password_validation("@Ca3t"));
        System.out.println("password_validation(\"pencil\") = " + password_validation("pencil"));

        System.out.println("password_validation(\"1m$IMi\") = " + password_validation2("1m$IMi"));
        System.out.println("password_validation2(\"@suNny8day\") = " + password_validation2("@suNny8day"));
        System.out.println("password_validation2(\"dog\") = " + password_validation2("dog"));

    }

}
