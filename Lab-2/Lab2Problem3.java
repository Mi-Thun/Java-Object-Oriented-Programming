package lab2problem3;

import java.util.Scanner;

public class Lab2Problem3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number here: ");
        int a = input.nextInt();
        int c = a;
        System.out.println("Enter second number here: ");
        int b = input.nextInt();
        int d = b;
        for (; a != b;) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("gcd(" + c + "," + d + ") --> " + a);
    }

}
