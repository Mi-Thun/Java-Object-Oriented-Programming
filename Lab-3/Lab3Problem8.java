package lab3problem8;

import java.util.Scanner;

public class Lab3Problem8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number here: ");
        int num = input.nextInt();
        int a = 0, rev = 0, b = 0;
        a = num;
        for (; num != 0;) {
            b = num % 10;
            rev = rev * 10 + b;
            num = num / 10;
        }
        if (a == rev) {
            System.out.println("It is Palindrome.");
        } else {
            System.out.println("Not a Palindrome.");
        }
    }

}
