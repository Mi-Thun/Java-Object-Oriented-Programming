package lab2problem19;

import java.util.Scanner;

public class Lab2Problem19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = input.nextInt();
        System.out.println("Input second number: ");
        int b = input.nextInt();
        System.out.println("Input third number: ");
        int c = input.nextInt();
        if (a - b >= 20 || b - c >= 20 || c - a >= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
