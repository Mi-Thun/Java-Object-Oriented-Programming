package lab2problem10;

import static java.lang.Math.PI;
import java.util.Scanner;

public class Lab2Problem10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius here: ");
        double radius = input.nextDouble();
        System.out.println("Perimeter is = " + 2 * PI * radius);
        System.out.println("Area is = " + PI * radius * radius);
    }

}
