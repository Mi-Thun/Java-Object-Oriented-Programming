package lab2problem5;

import java.util.Scanner;

public class Lab2Problem5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = input.nextInt();
        System.out.println("Input second number: ");
        int b = input.nextInt();
        System.out.println(a + " * " + b + " = " + a * b);
    }

}
