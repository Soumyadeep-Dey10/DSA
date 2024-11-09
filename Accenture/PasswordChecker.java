package Cheatsheet;

//  Write a function CheckPassword(str) which will accept the string as an 
// argument or parameter and validates the password. It will return 1 if the 
// conditions are satisfied else itʼll return 0?
//  The password is valid if it satisfies the below conditions:
//  a. It should contain at least 4 characters.
//  b. At least 1 numeric digit should be present.
//  c. At least 1 Capital letter should be there.
//  d. Passwords should not contain space or slash(/).
//  e. The starting character should not be a number.
//  Sample Test Case:
//  Input:
//  bB1_89
//  Output:
//  1
public class PasswordChecker {
    public static int checkNumeric(String password){
        int numeric_digit = 0;
        for (int i = 0; i < password.length(); i++){
            if(password.charAt(i) >= '0' && password.charAt(i) <= '9'){
                numeric_digit += 1;
            }
        }
        return numeric_digit;
    }
    public static boolean checkPassword(String password){

        boolean hasDigit = false;
        boolean isUppercase = false;

        if(password.length() < 4) return false;
        if(Character.isDigit(password.charAt(0))) return false;

        for(char ch : password.toCharArray()){
            if(Character.isDigit(ch)) hasDigit = true;
            if(Character.isUpperCase(ch)) isUppercase = true;
        }
        if(!hasDigit || !isUppercase) return  false;
        if(password.contains("/") || password.contains(" ")) return false;
        //check for at least one numeric digit
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPassword("bB1_/89"));
    }
}
