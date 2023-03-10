package lab2problem12;

import java.util.Scanner;

public class Lab2Problem12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Width: ");
        double a = input.nextDouble();
        System.out.println("Enter Height: ");
        double c = input.nextDouble();
        System.out.printf("Area is " + a + " * " + c + " = %.2f", (a * c));
        System.out.printf("\nPerimeter is " + 2 + " * (" + a + " * " + c + ") = %.2f \n", 2 * (a + c));
    }

}
