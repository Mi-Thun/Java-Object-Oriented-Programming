package lab2problem18;

import java.util.Scanner;

public class Lab2Problem18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int a = input.nextInt();
        System.out.println("Input the second number: ");
        int b = input.nextInt();
        System.out.println("Input the third number: ");
        int c = input.nextInt();
        if ((a + b) == c) {
            System.out.println("The result is: true");
        } else {
            System.out.println("The result is: false");
        }
    }

}
