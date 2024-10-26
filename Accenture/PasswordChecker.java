package Cheatsheet;

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
