package lab2problem20;

import java.util.Scanner;

public class Lab2Problem20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int a = input.nextInt();
        System.out.println("Input the second number: ");
        int b = input.nextInt();

        if (a >= 25 && a <= 75 && b >= 25 && b <= 75) {
            int c = a % 10;
            int d = a / 10;
            int e = b % 10;
            int f = b / 10;
            if (c == e || c == f || d == e || d == f) {
                System.out.println("Result: true");
            } else {
                System.out.println("Result: false");
            }
        } else {
            System.out.println("Enter valid number...");
        }
    }

}
