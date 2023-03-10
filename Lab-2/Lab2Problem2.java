package lab2problem2;

import java.util.Scanner;

public class Lab2Problem2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        while (true) {
            double marks = input.nextDouble();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid Number!");
            } else if (marks < 25) {
                System.out.println("F");
            } else if (marks < 45) {
                System.out.println("E");
            } else if (marks < 50) {
                System.out.println("D");
            } else if (marks < 60) {
                System.out.println("C");
            } else if (marks < 80) {
                System.out.println("B");
            } else if (marks >= 80) {
                System.out.println("A");
            }
        }

    }

}
