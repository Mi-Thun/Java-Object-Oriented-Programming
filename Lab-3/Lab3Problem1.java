package lab3problem1;

import java.util.Scanner;

public class Lab3Problem1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you number here: ");
        int a = input.nextInt();
        if (a % 2 == 0) {
            System.out.println("Even Number \nBye!");
        } else {
            System.out.println("Odd Number \nBye!");
        }
    }

}
