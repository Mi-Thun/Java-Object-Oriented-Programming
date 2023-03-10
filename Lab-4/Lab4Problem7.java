package lab4problem7;

import java.util.Scanner;

public class Lab4Problem7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the string : ");
        String string = input.nextLine();
        int stringLength = string.length();
        int count = 0, b = 0, c = 0, i, b2 = 5000, c2 = 0;
        for (i = 0; i < stringLength; i++) {
            count++;
            if (string.charAt(i) == ' ' || string.charAt(i) == '.') {
                if (count > b) {
                    b = count;
                    c = i;
                }
                if (count < b2) {
                    b2 = count;
                    c2 = i;
                }
                count = 0;
            }
        }
        System.out.print("The largest word is '");
        for (int j = c-b+1; j < c; j++) {
            System.out.print(string.charAt(j));
        }
        System.out.print("'"+ "\n");

        System.out.print("and the smallest word is '");
        for (int j = c2-b2+1; j < c2; j++) {
            System.out.print(string.charAt(j));
        }
        System.out.print("'");
    }
}
