package lab4problem6;

import java.util.Scanner;

public class Lab4Problem6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the string : ");
        String string = input.nextLine();
        System.out.print("Input the substring to be search : ");
        String subString = input.nextLine();
        int stringLength = string.length();
        int subStringLength = subString.length();
        int count = 0,b=0;
        for (int i = 0; i < stringLength; i++) {
            for (int j = 0; j < subStringLength; j++) {
                if (string.charAt(i)==subString.charAt(j)) {
                    count++;
                }
                if (string.charAt(i)!=subString.charAt(j)) {
                    i=i-j;
                    count = 0;
                    break;
                }
                if (count == subStringLength) {
                    b = b + 1;
                    count = 0;
                }
                i++;
            }
        }
        if (b != 0) {
            System.out.println("Result: The substring is exist in the string.\n" + subString +
                    " has been found " + b + " time.");
        } else {
            System.out.println("Result: The substring is not exist in the string.\n" + subString +
                    " has not been found yet.");
        }
    }
}
