package lab2problem15;

import java.util.Scanner;

public class Lab2Problem15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int a = input.nextInt();
        int c = 0;
        for (int i = 1; a % 10 != 0; i++) {
            int b = a % 10;                   // a is a input integer
            a = a / 10;
            c = c + b;
        }
        System.out.println("The sum of the digits is: " + c);
    }

}
