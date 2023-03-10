package lab2problem14;

import java.util.Scanner;

public class Lab2Problem14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st integer: ");
        int a = input.nextInt();
        System.out.println("Enter 2nd integer: ");
        int b = input.nextInt();
        if (a != b) {
            System.out.println(a + " != " + b);
        }
        if (a < b) {
            System.out.println(a + " < " + b);
        }
        if (a <= b) {
            System.out.println(a + " <= " + b);
        }
        if (a == b) {
            System.out.println(a + " == " + b);
        }
        if (a > b) {
            System.out.println(a + " > " + b);
        }
        if (a >= b) {
            System.out.println(a + " >= " + b);
        }
    }

}
