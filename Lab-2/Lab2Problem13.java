package lab2problem13;

import java.util.Scanner;

public class Lab2Problem13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st variable: ");
        String a = input.nextLine();
        System.out.println("Enter 2nd variable: ");
        String b = input.nextLine();
        String c = a;
        a = b;
        b = c;
        System.out.println("First variable after swap: " + a);
        System.out.println("Second variable after swap: " + b);
    }

}
