package lab4problem11;

import java.util.Scanner;

public class Lab4Problem11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n" +
                "Input a password (You are agreeing to the above Terms and Conditions.): ");
        String number = input.nextLine();
        if (isValidPassword(number)) {
            System.out.println("Password is valid: " + number);
        } else {
            System.out.println("Not a valid password: " + number);
        }
    }
    public static boolean isValidPassword(String password) {
        if (password.length() < 8)
            return false;
        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (isNumeric(ch)) {
                numCount++;
            } else if (isLetter(ch)) {
                charCount++;
            } else {
                return false;
            }
        }
        return (charCount >= 2 && numCount >= 2);
    }
    public static boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
    public static boolean isNumeric(char ch) {
        return (ch >= '0' && ch <= '9');
    }
}
